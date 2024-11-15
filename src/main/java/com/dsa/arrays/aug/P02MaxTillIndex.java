package src.main.java.com.dsa.arrays.aug;

import java.util.Arrays;

public class P02MaxTillIndex {
    public static void main(String[] args) {
        int [] arr={2,4,3,6,1};
        System.out.println(Arrays.toString(maxTillIndex(arr)));
    }
    static int[] maxTillIndex(int [] arr){
        for (int i=1;i<arr.length;i++){
            if (arr[i]<arr[i-1]){
                arr[i]=arr[i-1];
            }
        }
        return arr;
    }
}
