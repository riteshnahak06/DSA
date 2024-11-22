package src.main.java.com.dsa.arrays.hackersrank;

import java.util.Arrays;

public class P01FirstAndLastPositionOfSortedArray {
    public static void main(String[] args) {
        int [] arr={5 ,7 ,7 ,8,8,10};
        System.out.println(Arrays.toString(firstAndLastPositionOptimized(arr,8)));
    }

    private static int[] firstAndLastPositionOptimized(int [] arr,int target){
        int [] ans={-1,-1};
        ans[0]=findFirstPosition(arr,target);
        ans[1]=findLastPosition(arr,target);
        return ans;
    }


    private static int findFirstPosition(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]==target){
                ans=mid;
                end=mid-1; // search before mid as we need to check first.
            }else if (target<arr[mid]){
                end=mid-1;
            } else  {
                start=mid+1;
            }
        }
        return ans;
    }
    private static int findLastPosition(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]==target){
                ans=mid;
                start=mid+1; // search after mid as we need to check last index
            }else if (target<arr[mid]){
                end=mid-1;
            } else  {
                start=mid+1;
            }
        }
        return ans;
    }
    // if u want to eliminate multiple method user one flag to check isFirst.

    private static int findPosition(int[] arr, int target, boolean isFirst) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans = mid; // Record the position
                if (isFirst) {
                    end = mid - 1; // Move left for the first occurrence
                } else {
                    start = mid + 1; // Move right for the last occurrence
                }
            } else if (target < arr[mid]) {
                end = mid - 1; // Target is on the left
            } else {
                start = mid + 1; // Target is on the right
            }
        }
        return ans;
    }

    private static int[] firstAndLastPositionBrute(int[] arr,int target) {
        int first = -1, last = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (first == -1) { // First occurrence
                    first = i;
                }
                last = i; // Keep updating for the last occurrence
            }
        }
        return new int[]{first, last};
    }
}
