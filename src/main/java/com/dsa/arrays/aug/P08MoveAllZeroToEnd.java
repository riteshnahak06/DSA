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
        int start=0;
        int end=arr.length-1;
        while (start<end){
            if (arr[start]==0){
                swap(arr,start,end);
//                start++;-> This u should not write becz after swap if the start is zero and we exclude and go ahead that will create issue
                //anyway if it is not zero we are increasing in else so no need here
                end--;
            }else {
                start++;
            }
        }
        return arr;
    }
    static void swap(int [] arr, int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
