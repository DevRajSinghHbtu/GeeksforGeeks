// User function Template for Java
class Solution {
    static int setBits(int n) {
        // code here
        int c = 0;
        for(int i = 0; i<31; i++)
        {
            if((n & (1 << i)) != 0)
            {
                c++;
            }
        }
        return c;
    }
}