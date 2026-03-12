class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i<arr.length; i++){
            pq.add(arr[i]);
        }
        for(int i = 0; i<k-1; i++){
            pq.remove();
        }
        return pq.peek();
    }
}
