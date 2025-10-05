class Solution {

    void printGfg(int N) {
        // code here
        if(N==0)
        return;
        else
        printGfg(N-1);
        System.out.print("GFG ");
    }
}