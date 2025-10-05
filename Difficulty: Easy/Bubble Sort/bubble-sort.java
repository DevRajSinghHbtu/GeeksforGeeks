
class Solution {
    public void bubbleSort(int[] arr) {
        // code here
        int len = arr.length;
       for(int i = len-1;i>=0;i--)
       {
           for(int j = 0; j<=i-1; j++)
           {
               if(arr[j]>arr[j+1])
               {
                   swap(j, j+1, arr);
               }
           }
       }
    }
    void swap(int s, int l, int ar[])
    {
        int temp = ar[s];
        ar[s] = ar[l];
        ar[l] = temp;
    }
}