// User function Template for Java

class Solution {
    public static boolean checkSubsequenceSum(int N, int[] arr, int K) {
        // code here
        return check(0, N, K, arr);
    }
       static boolean check(int i, int N, int sum, int[] ar)
       {
           if(sum == 0)
           {
               return true;
           }
           else if(sum < 0 || i == N)
           {
               return false;
           }
           else
           {
              return check(i + 1, N, sum - ar[i], ar) ||
               check(i + 1, N, sum, ar);
           }
       }
}
