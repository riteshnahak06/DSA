package src.main.java.com.dsa.arrays.aug;

import java.util.Arrays;

public class P01PrefixSum {
    public static void main(String[] args) {
        int [] arr={2,4,3,6};
        System.out.println(Arrays.toString(prefixSum(arr)));
    }
    static int[] prefixSum(int [] arr){
        for (int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        return arr;
    }
}
