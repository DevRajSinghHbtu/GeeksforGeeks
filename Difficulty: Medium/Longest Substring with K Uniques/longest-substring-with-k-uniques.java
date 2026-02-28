class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int max = 0;
        
       Map<Character, Integer> freq = new HashMap<>();
       int l = 0;
       int r = 0;
       while(r<s.length()){
           freq.put(s.charAt(r), freq.getOrDefault(s.charAt(r), 0) + 1);
           while(freq.size() > k){
               char leftchar = s.charAt(l);
               freq.put(leftchar, freq.get(leftchar) - 1);
               if(freq.get(leftchar) == 0)
               freq.remove(leftchar);
               l++;
           }
           if(freq.size() == k){
               max = Math.max(max, r-l+1);
           }
           r++;
       }
       if(max == 0) return -1;
       return max;
    }
}