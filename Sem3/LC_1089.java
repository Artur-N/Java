// Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
// Note that elements beyond the length of the original array are not written. 
// Do the above modifications to the input array in place and do not return anything.

package Sem3;

import java.util.Arrays;

public class LC_1089 {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 0, 2, 3, 0, 4, 5, 0 };
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void duplicateZeros(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[i + 1] = 0;
                i++;
            }
        }
    }
}
