// User function Template for Java

import java.util.*;

class Solution {
    public ArrayList<Integer> findSubarray(int arr[]) {
        ArrayList<Integer> sm = new ArrayList<>();   // best subarray
        ArrayList<Integer> temp = new ArrayList<>(); // current subarray
        int n = arr.length;
        
        long max = -1;  // maximum sum so far
        long s = 0;     // current sum
        
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                // reset when negative found
                s = 0;
                temp.clear();
            } else {
                s += arr[i];
                temp.add(arr[i]);
                
                // update best if needed
                if (s > max || (s == max && temp.size() > sm.size())) {
                    max = s;
                    sm = new ArrayList<>(temp); // copy current
                }
            }
        }
        
        // if no non-negative subarray found
        if (sm.isEmpty()) {
            sm.add(-1);
        }
        
        return sm;
    }
}