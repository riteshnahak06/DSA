package src.main.java.com.dsa.arrays.leetcode;

import java.util.Arrays;

/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
Merge nums1 and nums2 into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function, but instead be stored inside
the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements
denote the elements that should be merged, and the last n elements are set to 0 and should be
 ignored. nums2 has a length of n.
 Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
 */
public class P88MergeSortedArray {
    public static void main(String[] args) {
        merge(new int[]{4,5,6,0,0,0},3,new int[]{1,2,3},3);
        merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=m-1;
        int p2=n-1;
        int p=m+n-1;
        while (p1>=0 && p2>=0){
            if (nums1[p1]>=nums2[p2]){
                nums1[p--]=nums1[p1--];
            }else {
                nums1[p--]=nums2[p2--];
            }
        }
        while (p2>=0){
            nums1[p--]=nums2[p2--];
        }
        System.out.println(Arrays.toString(nums1));
    }


}
