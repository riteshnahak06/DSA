package src.main.java.com.dsa.arrays.aug;

import java.util.Arrays;

/*
Give an array of sorted number and target sum,find pair whose sum =target
ip=[1,2,3,4,5] target =6;
op=[1,3]---> as value sum at both index is target
 */
public class P07PairSum {
    public static void main(String[] args) {
        int [] arr={1,3,1,1,3 ,6};
        System.out.println(Arrays.toString(pairSum2(arr,2)));
    }

    private static int[] pairSumBrutForce(int[] arr, int target) {
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){// j=i+1 to avoid the condition where both i and j value to be same
                if (arr[i]+arr[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    private static int[] pairSum2(int [] arr,int target){
        int start=0;
        int end=arr.length-1;
        while (start<end){//Changed condition to strictly <, since start == end makes no sense for a pair
            if (arr[start] + arr[end] >target){
                end--;
            }else if(arr[start] + arr [end] ==target) {
                return new int[] {start,end};
            }else {
                start++;
            }

        }
        return new int[]{-1,-1};
    }
}
