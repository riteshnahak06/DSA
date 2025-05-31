package src.main.java.com.dsa.arrays;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int [] arr={12,4,1,12,23,5,23};
        System.out.println(secondMaxOfArray(arr));
    }

    private static int maxOfArray(int[] arr) {
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    private static int secondMaxOfArray(int[] arr) {
        int max=arr[0];
        int ans=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                ans=max;
                max=arr[i];
            } else if (arr[i]<max && arr[i]>ans){
                ans=arr[i];
            }
        }
        return ans;
    }
}
