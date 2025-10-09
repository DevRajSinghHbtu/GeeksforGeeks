class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int left = search(arr, target, true);
        if(left == -1)
        return 0;
        int right = search(arr, target, false);
       return right-left+1;
       
       
    }
    int search(int [] arr, int target, boolean where)
    {
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = -1;
        while(s<=e)
        {
            int mid = s + (e-s)/2;
            if(arr[mid]>target)
            {
                e = mid-1;
            }
            else if(arr[mid]<target)
            {
                s = mid+1;
            }
            else
            {
                ans = mid;
                if(where)
                {
                    e = mid-1;
                }
                else
                {
                    s = mid+1;
                }
            }
        }
        return ans;
    }
}
