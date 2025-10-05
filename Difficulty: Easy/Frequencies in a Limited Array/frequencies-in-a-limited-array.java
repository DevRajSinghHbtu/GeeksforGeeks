//java.util.ArrayList;
class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        // code here
        int n = arr.length;
        ArrayList<Integer> li = new ArrayList<>(Collections.nCopies(n, 0));
        for(int i = 0; i<n; i++)
        {
            int val = arr[i];
            if(val >=1 && val<=n)
            {
                li.set(val-1, li.get(val-1)+1);
            }
           
            }
            return li;
    }
}
