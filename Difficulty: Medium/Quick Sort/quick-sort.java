class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
      if(low>=high)
      return;
      
      int s = low;
      int e = high;
      int mid = (s + (e-s)/2);
      int pivot = arr[mid];
      while(s<=e)
      {
          while(arr[s]<pivot)
          {
              s++;
          }
           while(arr[e]>pivot)
          {
              e--;
          }
          if(s<=e)
          {
              int temp = arr[s];
              arr[s] = arr[e];
              arr[e] = temp;
              s++;
              e--;
          }
      }
      quickSort(arr, low, e);
      quickSort(arr, s, high);
    }

   
}