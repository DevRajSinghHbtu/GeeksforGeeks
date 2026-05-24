class Solution {
    public static void reverseStack(Stack<Integer> st) {
        // code here
        int[] a = new int[st.size()];
        int i = 0;
        while(!st.isEmpty()){
            a[i] = st.pop();
            i++;
        }
        int j = 0;
        while(j<a.length){
            st.push(a[j]);
            j++;
        }
    }
}
