import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<a.length;i++)
        {
              // check if already present
            set.add(a[i]);
            
            
        }
        for(int j = 0;j<b.length;j++)
        {
              // check if already present
            set.add(b[j]);
            
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
}
}