package src.main.java.com.dsa.slidingwindow;

public class P02MaxSumSubArrayConstantWindow {
    // max sum u will obtain by picking k element consecutively
    // if it had as
    public static void main(String[] args) {
        int [] arr={2,3,1,-3,5,10,1};
        int windowSIze=4;
        System.out.println(maxSumInSubArray(arr,windowSIze));
    }

    private static int maxSumInSubArray(int[] arr, int windowSize) {
        int l = 0;
        int r = windowSize - 1;
        int sum = 0;
        for (int i = l; i <= r; i++) {
            sum += arr[i];
        }
        int maxSum = sum;
        while (r < arr.length - 1) {
            sum = sum - arr[l];
            l++;
            r++;
            sum = sum + arr[r];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }


}
