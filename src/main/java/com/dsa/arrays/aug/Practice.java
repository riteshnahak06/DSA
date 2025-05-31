package src.main.java.com.dsa.arrays.aug;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {2, 6, 4, 3, 6, 1, 6};
        System.out.println(isAsc(arr));
        System.out.println(nThFibonacci(4));
        System.out.println(Arrays.toString(mergerTwoSorted(new int[]{1,2,3},new int[]{3,4,6,7,8})));
//        System.out.println(Arrays.toString(prefixSum(arr)));
        System.out.println(secondMaxBrute(arr));
        System.out.println(Arrays.toString(maxTillIndex(arr)));
    }

    private static int secondMaxBrute(int[] arr) {
        int minValue = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                secondMin = minValue;
                minValue = arr[i];
            } else if (arr[i] < secondMin && arr[i] > minValue) {
                secondMin = arr[i];
            }
        }
        return secondMin;
    }

    private static int[] prefixSum(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
        return arr;
    }

    private static int[] maxTillIndex(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                arr[i] = arr[i - 1];
            }
        }
        return arr;
    }

    private static boolean isAsc(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
    private static int nThFibonacci(int n){
        int [] arr=new int[n];
        arr[0]=0;
        arr[1]=1;
        for (int i=2;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n-1];

    }
    private static int[] mergerTwoSorted(int [] arr1,int[] arr2){
        int [] ans=new int[arr1.length+arr2.length];
        int increment=arr1.length;
        for (int i=0;i<arr1.length;i++){
            ans[i]=arr1[i];
        }
        for (int i=0;i<arr2.length;i++){
            ans[increment]=arr2[i];
            increment++;
        }
        return ans;
    }
}