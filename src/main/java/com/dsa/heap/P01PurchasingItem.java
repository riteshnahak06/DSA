package src.main.java.com.dsa.heap;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

/*
arr=20,10 5,30,100 these are price of item
how many maximum item man can purchase if man has 35 rupee
 */
public class P01PurchasingItem {
    public static void main(String[] args) {
        int [] arr={20,10,5,30,100};
        System.out.println(purchaseItemBrutForce(arr,35));
    }


    public static int purchaseItemBrutForce(int [] arr,int wallet){
        Arrays.sort(arr);
        int count=0;
        int sum=0;
        for (int i = 0; i <arr.length; i++) {
            if (sum<wallet && wallet-sum>=arr[i]){
                count++;
            }
            sum+=arr[i];
        }
        return count;
    }
    
}
