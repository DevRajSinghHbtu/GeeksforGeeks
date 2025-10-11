class Solution {
    public int nthRoot(int n, int m) {
        // code here
        int s = 1;
        int e = m;
        int ans = -1;
        while(s<=e)
        {
            int mid = s + (e-s)/2;
            long pow = power(mid, n);
            if (pow == m) {
                return mid; 
            } else if (pow < m) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }
    int power(int base, int exp)
    {
        int result = 1;
        for(int i = 1; i<=exp;i++)
        {
            result = result * base;
        }
        return result;
    }
}