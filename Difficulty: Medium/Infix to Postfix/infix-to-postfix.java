class Solution {
    public static String infixToPostfix(String s) {
        // code here
        int i = 0;
       Stack<Character> stack = new Stack<>();
       String ans = "";
        while(i<s.length())
        {
            char ch = s.charAt(i);
            
            if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9'))
            {
                ans  = ans + ch;
            }
            else if(ch == '(')
            {
               stack.push(ch); 
            }
            else if(ch == ')')
            {
                while(!stack.isEmpty() && stack.peek() != '(')
                {
                    ans = ans + stack.peek();
                    stack.pop();
                }
                stack.pop();
            }
            else
            {
                while(!stack.isEmpty() && ((priority(ch) < priority(stack.peek())) ||
          ((priority(ch) == priority(stack.peek())) && ch != '^')))
                {
                    ans = ans + stack.peek();
                    stack.pop();
                }
                stack.push(ch);
            }
           
            i++;
        }
         while(!stack.isEmpty())
            {
                ans += stack.peek();
                stack.pop();
            }
            
        return ans;
    }
    static int priority(char ch)
    {
       
        if(ch == '^')
        return 3;
        else if(ch == '*' || ch == '/')
        return 2;
        else if(ch == '+' || ch == '-')
        return 1;
        else
        return 0;
    }
}