class Solution {
    public int findPages(int[] arr, int k) {
        // code here
        if(arr.length >= k)
        {
        int min = 0;
        int max = 0;
        for(int pages : arr)
        {
            min = Math.max(min, pages);
            max = max + pages;
        }
        int s = min;
        int e = max;
        while(s<=e)
        {
            int mid = s + (e-s)/2;
            int countstudent = countStudent(arr, mid);
            if(countstudent <= k)
            {
                e = mid-1;
            }
            else
            {
                s = mid+1;
            }
        }
        return s;
        }
        return -1;
    }
    int countStudent(int arr[], int pages)
    {
        int countstud = 1, pagescount = 0;
        for(int i = 0;i<arr.length;i++)
        {
            if(pagescount + arr[i] <= pages)
            {
                pagescount = pagescount + arr[i];
            }
            else
            {
                countstud++;
                pagescount = arr[i];
            }
        }
        return countstud;
    }
}