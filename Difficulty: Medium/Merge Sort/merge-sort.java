import java.util.Arrays;
class Solution {

    static void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;

            // Sort first half
            mergeSort(arr, l, mid);

            // Sort second half
            mergeSort(arr, mid + 1, r);

            // Merge the two halves
            merge(arr, l, mid, r);
        }
    }

    static void merge(int arr[], int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;

        // Create temp arrays
        int left[] = new int[n1];
        int right[] = new int[n2];

        // Copy data
        for (int i = 0; i < n1; i++)
            left[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            right[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = l;

        // Merge the temp arrays
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Copy remaining elements
        while (i < n1) {
            arr[k++] = left[i++];
        }
        while (j < n2) {
            arr[k++] = right[j++];
        }
    }
}