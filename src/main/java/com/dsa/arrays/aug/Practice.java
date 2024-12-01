package src.main.java.com.dsa.arrays.aug;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        System.out.println(answerBrut(arr));
    }

    private static int answerBrut(int[] arr) {
        int maxProfit=0;
        for (int  i=0;i<arr.length;i++){
            int currentProfit=0;
            for (int j=i;j<arr.length;j++){
                currentProfit=arr[j]-arr[i];
                maxProfit=Integer.max(currentProfit,maxProfit);
            }
        }
        return maxProfit;
    }

}
