package src.main.java.com.dsa.slidingwindow.leetcode;

import java.util.HashMap;
import java.util.Map;

public class L2461 {
    public static void main(String[] args) {
        /*
        You are given an integer array nums and an integer k. Find the maximum subarray sum of all the subarrays of nums that meet the following conditions:
            The length of the subarray is k, and
            All the elements of the subarray are distinct.
            Return the maximum subarray sum of all the subarrays that meet the conditions. If no subarray meets the conditions, return 0.
            A subarray is a contiguous non-empty sequence of elements within an array.
            Input: nums = [1,5,4,2,9,9,9], k = 3
Output: 15
Explanation: The subarrays of nums with length 3 are:
- [1,5,4] which meets the requirements and has a sum of 10.
- [5,4,2] which meets the requirements and has a sum of 11.
- [4,2,9] which meets the requirements and has a sum of 15.
- [2,9,9] which does not meet the requirements because the element 9 is repeated.
- [9,9,9] which does not meet the requirements because the element 9 is repeated.
We return 15 because it is the maximum subarray sum of all the subarrays that meet the conditions
         */
        int [] arr={1,5,4,2,9,9,9};
        System.out.println(maximumSubarraySum(arr,3));
    }
    public static long maximumSubarraySumOpt(int[] nums, int k){
        int i = 0, j = 0;
        long sum = 0;
        long maxSum = 0;
        Map<Integer, Integer> hm = new HashMap<>();
        while (j < nums.length) {
            // 1. Add incoming element
            sum += nums[j];
            hm.put(nums[j], hm.getOrDefault(nums[j], 0) + 1);
            if (j - i + 1 < k) {
                j++;
            }
            else if (j - i + 1 == k) {
                // Check whether all elements are distinct
                if (hm.size() == k) {
                    maxSum = Math.max(maxSum, sum);
                }
                // 4. Remove outgoing element
                hm.put(nums[i], hm.get(nums[i]) - 1);
                if (hm.get(nums[i]) == 0) {
                    // so means there is no duplicate so i can remove completely from hm
                    hm.remove(nums[i]);
                }
                sum -= nums[i];
                // 5. Slide window
                i++;
                j++;
            }
        }
        return maxSum;
    }


    public static long maximumSubarraySum(int[] nums, int k) {
        int i=0,j=0;
        long sum=0;
        long maxSum=Long.MIN_VALUE;
        while (j<nums.length){
            sum+=nums[j];
            if (j-i+1<k){
                j++;
            } else if (j - i + 1 == k) {
                if (isDistinct(nums, i, j, k)) {
                    maxSum = Math.max(sum, maxSum);
                }
                sum -= nums[i];
                i++;
                j++;
            }
        }
        return maxSum<0 ?0 :maxSum;
    }

    private static boolean isDistinct(int[] nums, int i, int j, int k) {
        Map<Integer, Integer> hm = new HashMap<>(); // key = number, value = count
        for (int l = i; l <= j; l++) {
            int num = nums[l];
            hm.put(num, hm.getOrDefault(num, 0) + 1);
            if (hm.get(num) > 1) {
                return false;
            }
        }
        return true;
    }
}
