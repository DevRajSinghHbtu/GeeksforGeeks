class Solution {
    public String infixToPrefix(String s) {
        // code here
        String a = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(')
                a += ')';
            else if (s.charAt(i) == ')')
                a += '(';
            else
                a += s.charAt(i);
        }

        int i = 0;
        Stack<Character> stack = new Stack<>();
        String ans = "";

        while (i < a.length()) {
            char ch = a.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') ||
                (ch >= 'a' && ch <= 'z') ||
                (ch >= '0' && ch <= '9')) {

                ans = ans + ch;
            }
            else if (ch == '(') {
                stack.push(ch);
            }
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    ans = ans + stack.peek();
                    stack.pop();
                }
                // 🔧 FIX: safety check
                if (!stack.isEmpty())
                    stack.pop();
            }
            else {
                while (!stack.isEmpty() &&
                      ((priority(ch) < priority(stack.peek())) ||
                      ((priority(ch) == priority(stack.peek())) && ch == '^'))) {

                    ans = ans + stack.peek();
                    stack.pop();
                }
                stack.push(ch);
            }
            i++;
        }

        while (!stack.isEmpty()) {
            ans += stack.peek();
            stack.pop();
        }

        String an = "";
        for (int j = ans.length() - 1; j >= 0; j--) {
            an += ans.charAt(j);
        }
        return an;
    }

    static int priority(char ch) {
        if (ch == '^') return 3;
        else if (ch == '*' || ch == '/') return 2;
        else if (ch == '+' || ch == '-') return 1;
        else return 0;
    }
}
