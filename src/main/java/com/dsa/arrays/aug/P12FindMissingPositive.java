package src.main.java.com.dsa.arrays.aug;

import java.util.Arrays;

/*
for unsorted array return smallest positive integer that is not present in num using o(n) and a(1)
ip -[1,2,0] --> op= 3 as 1&2 already there in array
ip [3,4,-1,1] op =2 as 2 is missing
ip [7,8,9,11,12] op =1 as 1 is the smallest positive integer
 */
public class P12FindMissingPositive {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,5};
        System.out.println(smallestPositiveIntegerBf3(arr));
    }
    private static int smallestPositiveIntegerOptimized(int [] arr){
        int n = arr.length;

        // Step 1: Place each number in its correct position
        for (int i = 0; i < n; i++) {
            while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
                // Swap arr[i] with arr[arr[i] - 1]
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
        }

        // Step 2: Find the first missing positive integer
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        // Step 3: If all numbers are in their correct positions
        return n + 1;
    }

    private static int smallestPositiveIntegerBf3(int[] arr) {
        boolean[] ans = new boolean[arr.length + 1];
        // Mark the positions of positive integers within the range
        for (int num : arr) {
            if (num > 0 && num <= arr.length) {
                ans[num] = true;
            }
        }
        // Find the smallest missing positive integer
        for (int i = 1; i < ans.length; i++) {
            if (!ans[i]) {
                return i;
            }
        }
        // If all numbers from 1 to arr.length are present, return the next integer
        return arr.length + 1;
    }
    private static int smallestPositiveIntegerBf2(int[] arr){
        arr=Arrays.stream(arr).sorted().toArray();
        int k=1;
        for (int i=0;i<arr.length;i++){
            // Skip duplicate values
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue; //now won't execute next line and go for next i.
            }

            if (arr[i]!=k){
                return k;
            }
            k++;
        }
        return k;// if no missing no found return next integer
    }

    private static int smallestPositiveIntegerBf1(int[] arr) {
        for (int i=1;i<=arr.length+1;i++){
            boolean found=false;
            for (int j=0;j<arr.length;j++){
                if (i==arr[j]){
                    found=true;
                    break; //out of for loop
                }
            }
            if (found==false){
                return i;
            }
        }
        return -1;
    }


}
