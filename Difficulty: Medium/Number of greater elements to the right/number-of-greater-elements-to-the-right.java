
class Solution {
    public static int[] count_NGE(int arr[], int indices[]) {
        // code here
        int i = 0;
        int[] ans = new int[indices.length];
        int c = 0;
        while(i<indices.length)
        {
            c=0;
            for(int j = indices[i] + 1; j<arr.length; j++)
            {
                if(arr[indices[i]] < arr[j])
                {
                    c++;
                }
            }
            ans[i] = c;
            i++;
        }
        return ans;
    }
}
