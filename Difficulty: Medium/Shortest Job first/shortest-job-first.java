class Solution {
    static int solve(int bt[]) {
        // code here
        Arrays.sort(bt);
        int sum = 0;
        int f = 0;
        int x = 0;
        for(int i = 0; i<bt.length; i++){
            sum += x;
            f += sum;
            x = bt[i];
        }
        return (int)(f/bt.length);
    }
}
