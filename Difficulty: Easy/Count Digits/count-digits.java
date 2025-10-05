class Solution {
    int c = 0;
    public int countDigits(int n) {
        // code here
      //  int c = 0;
        if(n>=1)
        {
            c++;
            return countDigits(n/10);
        }
        else
        return c;
    }
}
