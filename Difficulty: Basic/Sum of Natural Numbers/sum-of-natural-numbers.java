class Solution {
    public static int findSum(int n) {
        // code here
        if(n==0)
        return n;
        else
        return (n + findSum(n-1));
        
    }
}