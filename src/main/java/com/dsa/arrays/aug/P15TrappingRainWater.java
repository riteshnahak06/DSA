package src.main.java.com.dsa.arrays.aug;

import java.util.Arrays;

public class P15TrappingRainWater {
    public static void main(String[] args) {
        System.out.println(trapApproach2(new int[] {4,2,0,3,2,5}));
    }
    private static int trapApproach2(int [] arr){
        int l=0;int r=arr.length-1;
        int lMax=0;int rMax=0;
        int ans=0;
        //calc left max and right max
        while (l<r){
            lMax=Math.max(lMax,arr[l]);
            rMax=Math.max(rMax,arr[r]);
            //alwasy minumm hright will trap water
            if (lMax<rMax){
                ans+=lMax-arr[l];
                l++;
            }else {
                ans+=rMax-arr[r];
                r++;
            }
        }
        return ans;
    }

    private static int trapApproach1(int [] arr){
        int [] lMax=new int[arr.length];
        int [] rMax=new int[arr.length];
        int ans=0;
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]<=max){
                lMax[i]=max;
            }else {
                lMax[i]=arr[i];
                max=arr[i];
            }

        }
        int rmax=arr[arr.length-1];
        for (int i=arr.length-1;i>=0;i--){
            if (arr[i]<=rmax){
                rMax[i]=rmax;
            }else {
                rMax[i]=arr[i];
                rmax=arr[i];
            }

        }
        for (int i=0;i<arr.length;i++) {
            ans += (Math.min(lMax[i], rMax[i]) - arr[i]);
        }
        return ans;
    }
}
