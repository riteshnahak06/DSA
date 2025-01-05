package src.main.java.com.dsa.heap;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class P02KLargestElement {
    public static void main(String[] args) {
        int [] arr={5,15,10,20,8};
        System.out.println(Arrays.toString(kLargestElement(arr,2)));

    }
    static int[] kLargestElement(int [] arr, int k){
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(Collections.reverseOrder());
        int [] ansArray=new int[k];
        // o(n)
        for (int i = 0; i < arr.length; i++) {
            priorityQueue.add(arr[i]); //logn
        }
        //overaal for above loop -- nlogn
        for (int i=0;i<k;i++){
            ansArray[i]= priorityQueue.poll();
        }
        // for above --klogn
        //so total - nlogn+klogn
        return ansArray;
    }
}
