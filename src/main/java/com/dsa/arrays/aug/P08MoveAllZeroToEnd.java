package src.main.java.com.dsa.arrays.aug;

import java.util.Arrays;

/*
ip -[ 1 0 2 0 3]
op- [1 2 3 0 0 ]
not necessarily to be sorted
 */
public class P08MoveAllZeroToEnd {
    public static void main(String[] args) {
        int [] arr={0,1,0,2,0};
        System.out.println(Arrays.toString(moveAllZero(arr)));;

    }

    static int [] moveAllZeroBruteforce(int [] arr){
        int [] ans=new int[arr.length];
        int j=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=0){
                ans[j++]=arr[i];
            }
        }
        return ans;
    }
    static int [] moveAllZero (int [] arr){
        int i=0; // for iteration
        int j=0; // to track first zero from left
        while (i<arr.length){
            if (arr[i]!=0){
                //swap and move j to search new zero
                swap(arr,i,j);
                j++;
            } i++;
        }
        return arr;
    }
    static void swap(int [] arr, int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
