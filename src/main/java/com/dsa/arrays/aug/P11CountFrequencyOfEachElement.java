package src.main.java.com.dsa.arrays.aug;

import java.util.HashMap;
import java.util.Map;

public class P11CountFrequencyOfEachElement {
    public static void main(String[] args) {
        int [] arr={1,2,2,3,3,4};
        countFrequency(arr);
    }

    private static void countFrequency(int[] arr) {
        Map<Integer,Integer> hm=new HashMap<>();
        for (int i=0;i< arr.length;i++){
            if (hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }else {
                hm.put(arr[i],1);
            }
        }
        System.out.println(hm);
    }
}
