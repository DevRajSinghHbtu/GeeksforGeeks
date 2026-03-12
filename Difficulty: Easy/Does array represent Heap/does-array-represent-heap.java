// User function Template for Java

class Solution {

    public boolean countSub(long arr[], long n) {
        // Your code goes here
        for(int i = 0; i<=(n/2)-1; i++){
           int l = 2*i + 1;
           if(l<n && arr[i] < arr[l]) return false;
           int r = 2*i + 2;
            if(r<n && arr[i] < arr[r]) return false;
        }
        return true;
    }
}