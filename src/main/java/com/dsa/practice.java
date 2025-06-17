package src.main.java.com.dsa;

import java.util.HashMap;
import java.util.Map;

public class practice {
    public static void main(String[] args) {
        int[] arr={1,-3,2,1,2,7,8,9,24};
        System.out.println(firstMissingPositive(arr));
    }

    private static int  firstMissingPositive(int[] arr) {
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            while (arr[i]>0 && arr[i]<=n && arr[arr[i]-1]!=arr[i]){
                int temp=arr[arr[i]-1];
                arr[arr[i]-1]=arr[i];
                arr[i]=temp;
            }
        }
        for (int i=0;i<n;i++){
            if (arr[i]!=i+1){
                return i+1;
            }
        }
        return -1;
    }
}
