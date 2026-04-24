class Solution {
    public int minPlatform(int arr[], int dep[]) {
     Arrays.sort(arr);
     Arrays.sort(dep);
     int i = 0;
     int j = 0;
     int n = arr.length;
     int maxcount = 0;
     int count = 0;
     
     while(i<n){
         if(arr[i] <= dep[j]){
             count++;
             i++;
         }
         else{
             count--;
             j++;
         }
        maxcount = Math.max(maxcount, count); 
     }
     return maxcount;
    }
}
