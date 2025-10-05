import java.util.Arrays;

class Solution {
    public void reverseArray(int arr[]) {
        int i = 0, j = arr.length - 1;

        // Swap elements from both ends until middle is reached
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        // Print the reversed array
       // System.out.println(Arrays.toString(arr));
    }
}