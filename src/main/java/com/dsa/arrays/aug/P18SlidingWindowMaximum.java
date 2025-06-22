package src.main.java.com.dsa.arrays.aug;

import java.util.Arrays;

public class P18SlidingWindowMaximum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(slidingMax(new int[]{2,4,1,2,3,1},3)));
    }
    private static int [] slidingMax(int [] arr,int k){
        int [] ansArray=new int[arr.length-(k-1)];
        int max=0;
        int i=0;
        return ansArray;
    }
}
