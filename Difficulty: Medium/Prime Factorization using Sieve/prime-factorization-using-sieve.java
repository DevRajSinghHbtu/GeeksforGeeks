// User function Template for Java

class Solution {
    // You must implement this function
   
  //  static int n = 0;
    static List<Integer> findPrimeFactors(int N) {
        // code here
        //n = N;
      int[] a = new int[N+1];
        for(int i = 2; i<=N; i++)
        {
            a[i] = 1;
        }
        for(int i = 2; i*i<=N; i++)
        {
            if(a[i]==1)
            {
                for(int j = i*i; j<=N; j += i)
                {
                    a[j] = 0;
                }
            }
        }
        List<Integer> li = new ArrayList<>();
       for(int i = 2; i<=N;i++)
       {
           if(a[i]==1)
           {
               li.add(i);
           }
       }
        List<Integer> ans = new ArrayList<>();
        
        for(int b : li)
        {
            while(N%b == 0)
            {
                N = N/b;
                ans.add(b);
            }
        }
        return ans;
    }
     static void sieve() {
        
       
       
    }
    
}
