// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int num = n;
        int d=0;
        int sum = 0;
        while(n!= 0)
        {
           d = n%10;
           sum = sum + (int)Math.pow(d, 3);
           n = n/10;
        }
        if(sum == num)
        {
            return true;
        }
        return false;
    }
}