package src.main.java.com.dsa.slidingwindow.leetcode;

public class L1343 {
    public static void main(String[] args) {
        //Given an array of integers arr and two integers k and threshold,
        // return the number of sub-arrays of size k and average greater than or
        // equal to threshold.

        /*
        Input: arr = [2,2,2,2,5,5,5,8], k = 3, threshold = 4
        Output: 3
        Explanation: Sub-arrays [2,5,5],[5,5,5] and [5,5,8] have averages 4, 5 and 6
        respectively. All other sub-arrays of size 3 have averages less than 4 (the threshold).
         */
        int [] arr={11,13,17,23,29,31,7,5,2,3};
        System.out.println(numOfSubarrays(arr,3,5));
    }
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int res=0; // count of avg greater than threshold
        int i=0,j=0;
        int sum=0;
        while (j<arr.length){
            sum+=arr[j];

            if (j-i+1<k){
                j++;
            } else if (j-i+1==k) {
                if (sum/k>=threshold){
                    res++;
                }
                sum-=arr[i];
                i++;
                j++;
            }
        }
        return res;
    }
}
