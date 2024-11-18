package src.main.java.com.dsa.arrays.aug;

public class P09MaximumSubArraySum {
    public static void main(String[] args) {
        int [] arr={-2, 1,-3, 4,-1, 2, 1,-5, 4};
        System.out.println(maxSubArray(arr));

    }

    private static int maxSubArray(int[] arr) {
        int maxSum=Integer.MIN_VALUE;
        int currentSum=0;
        for (int i=0;i<arr.length;i++){
            currentSum+=arr[i];
            maxSum=Math.max(currentSum,maxSum);
            if (currentSum<0){
                currentSum=0;
            }
        }
        return maxSum;
    }

    private static int maxSubArrayBruteForce(int[] arr) {
        int maxSum=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            int currentSum=0;
            for (int j=i;j<arr.length;j++){
                currentSum+=arr[j];
                maxSum=Math.max(currentSum,maxSum);
            }
        }
        return maxSum;
    }
}
