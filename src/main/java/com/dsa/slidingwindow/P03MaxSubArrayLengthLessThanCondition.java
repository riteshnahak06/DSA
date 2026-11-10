package src.main.java.com.dsa.slidingwindow;

// find max subarray length where sum is less than k
public class P03MaxSubArrayLengthLessThanCondition {
    public static void main(String[] args) {
        int [] arr={2,3,1,-3,5,10,1};
        int k=14;
        maxSubArrLengthSumLessThanK(arr,14);
    }

    private static int maxSubArrLengthSumLessThanK(int[] arr, int k) {
        int l = 0,r=0;
        int sum=0;
        int maxLength=0;
        for (int i=l;i<arr.length-1;i++){
            sum+=arr[i];
            maxLength=r-l+1;
            r++;
        }


        return 0;
    }
}
