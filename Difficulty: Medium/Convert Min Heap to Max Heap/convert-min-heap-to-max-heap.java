// User function Template for Java

class Solution {
    static void convertMinToMaxHeap(int N, int arr[]) {
        // code here
        for(int i = (N-2)/2; i>=0; --i){
            maxHeapify(arr, i, N);
        }
        
      
    }
    static void maxHeapify(int[] arr, int i, int N){
        int l = 2*i + 1;
        int r = 2*i + 2;
        int largest = i;
        
        if(l<N && arr[l] > arr[largest]){
            largest = l;
        }
         if(r<N && arr[r] > arr[largest]){
            largest = r;
        }
        
        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            maxHeapify(arr, largest, N);
        }
    }
}
