class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        int ans = -1;
        int n = arr.length;
        int s = 0;
        int e = n-1;
        while(s<=e)
        {
            int mid = s + (e-s)/2;
            if(arr[mid]<=x)
            {
                ans = mid;
                s = mid+1;
                
            }
            else if(arr[mid]>x)
            {
                e = mid-1;
            }
        }
        return ans;
    }
}
