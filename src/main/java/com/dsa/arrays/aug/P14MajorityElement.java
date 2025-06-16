package src.main.java.com.dsa.arrays.aug;

import java.util.HashMap;
import java.util.Map;

// majority element is the element which appears more than n/2 times
// [2,2,1,1,1,2,2] -> op -> 2 as it appears 7/2->mor than 3 times
public class P14MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElementOptimized((new int[]{2,3,2,1,1,1,1,1,3})));
    }
    // moore's voting algorithm
    private static int majorityElementOptimized(int[] arr) {
        int candidate=0;
        int count=0;
        for (int num: arr){
            if (count==0){
                //assign new candidate
                candidate=num;
            }
            // when num give vote to candidate add +1 else -1;
            count+=(candidate==num)?1:-1;
        }
        // confirm candidate is majority or not
        int freq=0;
        for(int num: arr){
            if (candidate==num){
                freq++;
            }
        }
        return (freq>arr.length/2)?candidate:-1;
    }

    private static int majorityElement(int[] arr) {
        Map<Integer, Integer> hm = new HashMap<>();
        int threshold = arr.length / 2;
        for (int num : arr) {
            int count = hm.getOrDefault(num, 0) + 1;
            if (count > threshold) {
                return num;  // early exit as soon as majority is found
            }
            hm.put(num, count);
        }
        return -1; // return -1 if no majority exists
    }


}
