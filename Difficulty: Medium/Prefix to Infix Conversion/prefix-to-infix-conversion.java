// User function Template for Java

class Solution {
    static String preToInfix(String pre_exp) {
        // code here
        int i = pre_exp.length()-1;
        Stack<String> st = new Stack<>();
        while(i>=0)
        {
            char ch = pre_exp.charAt(i);
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
                     String o = '(' + t1 + ch + t2 + ')';
                     st.push(o);
                 }
                 i--;
        }
        return st.peek();
        
    }
}
