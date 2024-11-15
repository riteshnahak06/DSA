package src.main.java.com.dsa.arrays.aug;

import java.util.Arrays;

public class P03SecondMax {
    public static void main(String[] args) {
        int [] arr={2,4,3,6,1};
        System.out.println(secondMax(arr));
    }

    private static int secondMax(int[] arr) {
        int ans=-1;
        int max=0;
        for (int i=1;i<arr.length;i++){
            if (arr[i]>arr[max]){
                ans=max;
                max=i;
            }else if(arr[i]!=arr[max]){
                if (arr[i]==-1 || arr[i]>ans){
                    ans=i;
                }
            }
        }
        return arr[ans];

    }
}
