package src.main.java.com.dsa.arrays.aug;

import java.util.Arrays;

public class P04AscendingOrNot {
    public static void main(String[] args) {
        int [] arr={2,4,6,8,10};
        System.out.println(isAscending(arr));
    }

    private static boolean isAscending(int[] arr) {
        for (int i=1;i< arr.length;i++){
            if (arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
