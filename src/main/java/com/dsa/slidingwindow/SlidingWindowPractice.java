package src.main.java.com.dsa.slidingwindow;

public class SlidingWindowPractice {
    public static void main(String[] args) {
        int[] arr={2, 1, 5, 1, 3, 2};
        System.out.println(maxSumSubArray(arr,3));

    }

    private static int maxSumSubArray(int[] arr, int k) {
        int i=0,j=0;
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        while (j<arr.length){
            sum+=arr[j];
            if (j-i+1<k){
                j++;
            } else if (j-i+1==k) {
                //found window size
                maxSum=Math.max(sum,maxSum);
                sum-=arr[i];
                i++;
                j++;
            }
        }
        return maxSum;
    }
}
