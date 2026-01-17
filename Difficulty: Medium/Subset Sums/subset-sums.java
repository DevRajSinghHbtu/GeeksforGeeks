// User function Template for Java//User function Template for Java
class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        
       ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
         outer.add(new ArrayList<>());
        ArrayList<Integer> ans = new ArrayList<>();
      // int sum = 0;
        for(int num : arr)
        {
            int n = outer.size();
            for(int i = 0; i<n; i++)
            {
                 ArrayList<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                
                outer.add(internal);
            }
        }
        for(int i = 0; i<outer.size(); i++)
        {
            int sum = 0;
            for(int j = 0; j<outer.get(i).size(); j++)
            {
                sum = sum + outer.get(i).get(j);
            }
            ans.add(sum);
        }
        return ans;
    }
}