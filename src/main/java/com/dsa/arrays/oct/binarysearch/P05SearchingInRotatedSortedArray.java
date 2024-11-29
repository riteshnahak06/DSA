package src.main.java.com.dsa.arrays.oct.binarysearch;

import java.util.Arrays;

public class P05SearchingInRotatedSortedArray {
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50,8,9};
        System.out.println(searchInRotatedArray1(arr,30));
    }

    private static int searchInRotatedArray1(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]==target) return mid;
            if (arr[start]<=arr[mid]){
                // if comes inside means left side of mid sorted
                //now do binary search here
                if (target<arr[mid] && target>=arr[start]){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }else {
                // if comes inside means right side of mid sorted
                if (target>arr[mid] && target<=arr[end]){
                    start=mid+1;
                }else {
                    end=mid-1;
                }
            }
        }
        return -1;
    }

    private static int searchInRotatedArrayBrut(int[] arr, int target) {
        for (int i=0;i<arr.length;i++){
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
