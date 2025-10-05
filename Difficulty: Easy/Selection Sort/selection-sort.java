class Solution {
    void selectionSort(int[] arr) {
        // code here
        int len = arr.length;
       // int min = 0;
        for(int x = 0;x<len-1;x++)
        {
             int min = x;
            for(int y = x+1;y<len;y++)
            {
                if(arr[y]<arr[min])
                min = y;
                
            }
            swap(x, min, arr);
        }
    }
    void swap(int f, int l, int ar[])
    {
        int temp = 0;
        temp = ar[f];
        ar[f] = ar[l];
        ar[l] = temp;
    }
}