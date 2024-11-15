package src.main.java.com.dsa.arrays.aug;

import java.util.Arrays;

public class P06MergeTwoSortedArrayInSortedWay {
    public static void main(String[] args) {
        int []ansMergeSortArray=mergeTwoSortedArrayInOrder(new int[]{1,2,3,4},new int[]{4,5,6,12,14,56,78});
        System.out.println(Arrays.toString(ansMergeSortArray));
    }


    private static int[] mergeTwoSortedArrayInOrder(int[] arr1, int[] arr2) {
        int []ans=new int[arr1.length + arr2.length];
        int i = 0,j=0,k=0;
        while (i<arr1.length && j< arr2.length){
            if (arr1[i]<arr2[j]){
                ans[k++]=arr1[i++];
            }else {
                ans[k++]=arr2[j++];
            }
        }

        /*
        Once one of the arrays is fully traversed (i.e., one of i == n1 or j == n2), the loop exits.
        At this point:
            If arr1 has remaining elements (i.e., i < n1), we need to copy them over to merged.
            If arr2 has remaining elements (i.e., j < n2), we need to copy them over to merged.

         */
        while (i<arr1.length){
            ans[k++]=arr1[i++];
        }
        while (j<arr2.length){
            ans[k++]=arr2[j++];
        }
        return ans;
    }
}
