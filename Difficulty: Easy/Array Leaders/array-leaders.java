class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
       ArrayList<Integer> list = new ArrayList<>();
       int n = arr.length;
    int maxfromright = arr[n-1];
    list.add(maxfromright);
    for(int i = n-2; i>=0;i--)
    {
        if(arr[i]>=maxfromright)
        {
            maxfromright=arr[i];
            list.add(maxfromright);
        }
    }
    Collections.reverse(list);
    return list;
    }
}
