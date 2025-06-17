package src.main.java.com.dsa.arrays.aug;

import java.util.Arrays;

// [1,2,3,4,5,6] k=3-> [4,5,6,1,2,3]
public class P05RotationOfArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotateLeft(new int[]{1,2,3,4,5,6},5)));
    }
    private static int[] rotateLeft(int[] arr, int d) {
        int n = arr.length;
        d = d % n;  // Handle if d > n

        reverse(arr, 0, d - 1);        // Reverse first part
        reverse(arr, d, n - 1);        // Reverse second part
        reverse(arr, 0, n - 1);// Reverse whole array
        return arr;
    }
    private static void rotateRight(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // to handle if d > n

        // Step 1: Reverse the whole array
        reverse(arr, 0, n - 1);

        // Step 2: Reverse the first d elements
        reverse(arr, 0, d - 1);

        // Step 3: Reverse the remaining elements
        reverse(arr, d, n - 1);
    }
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
