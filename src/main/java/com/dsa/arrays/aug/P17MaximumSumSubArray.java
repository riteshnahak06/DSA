package src.main.java.com.dsa.arrays.aug;

public class P17MaximumSumSubArray {
    public static void main(String[] args) {
        //[1,9,2,7,7], k=3 -> op->18
        System.out.println(maxSum(new int[]{1,9,2,7,7},3));
    }
    private static int maxSum(int [] arr, int k){
        int windowSum=0;
        for (int i=0;i<k;i++){
            windowSum+=arr[i];
        }
        int maxSum=windowSum;
        for (int i=k;i<arr.length;i++){
            windowSum+=arr[i]-arr[i-k];
            maxSum=Math.max(maxSum,windowSum);
        }
        return maxSum;
    }
}
