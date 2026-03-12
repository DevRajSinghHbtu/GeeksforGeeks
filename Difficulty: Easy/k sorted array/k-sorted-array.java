// User function Template for Java

class Solution {
    static String isKSortedArray(int arr[], int n, int k) {
        // code here
       Map<Integer, Integer> mp = new HashMap<>();
       for(int i = 0; i<n; i++){
           mp.put(arr[i], i);
       }
       Arrays.sort(arr);
       
       for(int i = 0; i<n; i++){
           if(Math.abs(mp.get(arr[i]) - i) > k) 
           {
               return "No";
           }
           
       }
       return "Yes";
    }
}