class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int min = stalls[0];
        int max = stalls[stalls.length-1];
        int i;
        for(i = 1; i<=max-min;i++)
        {
            if(ifPossible(stalls, i, k))
            {
                continue;
            }
            else
            {
                return i-1;
            }
        }
        return i-1;
        
    }
    Boolean ifPossible(int arr[], int dist, int cows)
    {
        int countcows = 1, last = arr[0];
        for(int i = 1;i<arr.length;i++)
        {
            if(arr[i]-last >= dist)
            {
                countcows++;
                last = arr[i];
            }
        }
        if(countcows >= cows)
        return true;
        return false;
    }
}