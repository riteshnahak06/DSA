package src.main.java.com.dsa.slidingwindow;

public class P01SumOfSubArray {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,2,1};
        printSumOfSubArray(arr,3);
    }

    private static void printSumOfSubArray(int[] arr, int k) {
        int ws=0;
        int n=arr.length;
        for (int i=0;i<k;i++){
            ws+=arr[i];
        }
        System.out.println(ws);
        for (int i = k; i < n ; i++) {
            ws = ws + arr[i] - arr[i - k];
            System.out.println(ws);
        }
    }

}
