class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int pivot = findpivot(arr);
        return pivot + 1;
    }
    int findpivot(int [] nums)
    {
        int n = nums.length;
         int s = 0;
       int e = n-1;
       if(nums[0]<nums[n-1])
       {
           return -1;
       }
       
       while(s<=e)
       {
           int mid = s + (e-s)/2;
           if(mid<e && nums[mid]>nums[mid+1])
           {
               return mid;
           }
           if(mid>s && nums[mid]<nums[mid-1])
           {
               return mid-1;
           }
           else if(nums[mid]>nums[s])
           {
               s = mid + 1;
           }
           else
           {
               e = mid -1;
           }
       }
       return -1;
    }
}