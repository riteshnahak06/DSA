package src.main.java.com.dsa.arrays.aug;

import java.util.Arrays;

public class P03SecondMax {
    public static void main(String[] args) {
        int [] arr={2,4,3,6,1};
        System.out.println(secondMax(arr));
    }

    private static int secondMax(int[] arr) {

        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                secondMax=max;
                max=arr[i];
            } else if (arr[i]>secondMax && arr[i]<max) {
                secondMax=arr[i];
            }
        }
        return secondMax;
    }
}
