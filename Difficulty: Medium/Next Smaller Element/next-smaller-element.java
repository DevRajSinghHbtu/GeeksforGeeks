class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        int i = 0;
        ArrayList<Integer> li = new ArrayList<>();
        while(i<arr.length)
        {
            boolean flag = false;
            for(int j = i+1; j<arr.length; j++)
            {
                 flag = false;
                if(arr[i]>arr[j])
                {
                    li.add(arr[j]);
                    flag = true;
                    break;
                }
            }
            if(!flag)
            {
                li.add(-1);
            }
            i++;
        }
        return li;
    }
}