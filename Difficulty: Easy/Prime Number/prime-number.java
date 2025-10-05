import java.util.*;
class Solution {
    static boolean isPrime(int n) {
        // code here
      // int c = 0;
       if(n!=1)
       {
       for(int i = 2;i*i<=n;i++)
       {
           if(n%i==0)
           {
              // c++;
              return false;
             
           }
          continue;
           
       }
       return true;
      // if(c>0)
      // return false;
       //else
     //  return true;
       }
       return false;
    }
 }    
 