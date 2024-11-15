package src.main.java.com.dsa.arrays.aug;

import java.util.Arrays;

public class P06MergeTwoSortedArray {
    public static void main(String[] args) {
        int [] arr1={2,4,6,76,89};
        int [] arr2={34,23,21,12};
        System.out.println(Arrays.toString(mergeTwoArray(arr1,arr2)));
    }

    private static int[] mergeTwoArray(int[] arr1, int[] arr2) {
        int [] arr3=new int[arr1.length+arr2.length];
        for (int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        for (int j=0;j<arr2.length;j++){
            arr3[arr1.length+j]=arr2[j];
        }
        return arr3;
    }

}
