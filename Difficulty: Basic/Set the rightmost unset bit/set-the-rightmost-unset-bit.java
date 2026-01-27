// User function Template for Java
class Solution {
    static int setBit(int n) {
        // code here
        int i = 0;
        for(i = 0; i< 31; i++)
        {
            if((n & (1 << i)) == 0)
            {
                break;
                
            }
            
        }
       return (n | (1 << i));
       
    }
}