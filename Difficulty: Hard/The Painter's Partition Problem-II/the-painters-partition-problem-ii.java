class Solution {
    public int minTime(int[] arr, int k) {
        // code here
        int min = 0;
        int max = 0;
        for(int a : arr)
        {
            min = Math.max(a, min);
            max = max + a;
        }
        int s = min;
        int e = max;
        while(s<=e)
        {
            int mid = s + (e-s)/2;
            int l = numberOfPainter(arr, mid);
            if(l <= k)
            {
                e = mid-1;
            }
            else
            {
                s = mid + 1;
            }
        }
        return s;
    }
    int numberOfPainter(int [] arr, int mid)
    {
        int painter = 1;
        int timetaken = 0;
        for(int i = 0;i<arr.length;i++)
        {
            if(timetaken + arr[i] <= mid)
            {
                timetaken = timetaken + arr[i];
            }
            else
            {
                timetaken = arr[i];
                painter++;
            }
        }
        return painter;
    }
}
