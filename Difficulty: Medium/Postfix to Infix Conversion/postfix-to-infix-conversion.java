// User function Template for Java

class Solution {
    static String postToInfix(String exp) {
        // code here
        int i = 0;
        Stack<String> st = new Stack<>();
        while(i<exp.length())
        {
            char ch = exp.charAt(i);
            if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9'))
                 {
                     st.push(ch+"");
                 }
                 else
                 {
                     String t1 = st.peek();
                     st.pop();
                     String t2 = st.peek();
                     st.pop();
                     String o = '(' + t2 + ch + t1 + ')';
                     st.push(o);
                 }
                 i++;
        }
        return st.peek();
    }
}
