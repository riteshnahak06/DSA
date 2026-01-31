package src.main.java.com.dsa.arrays.leetcode;

import java.security.Key;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
You are given an array nums consisting of positive integers.
Return the total frequencies of elements in nums such that those elements all have the maximum frequency.
The frequency of an element is the number of occurrences of that element in the array.
Example 1:
Input: nums = [1,2,2,3,1,4]
Output: 4
Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum frequency in the array.
So the number of elements in the array with maximum frequency is 4.

Example 2:
Input: nums = [1,2,3,4,5]
Output: 5
Explanation: All elements of the array have a frequency of 1 which is the maximum.
So the number of elements in the array with maximum frequency is 5.
 */
public class P3005CountElementsWithMaxFre {
    public static void main(String[] args) {
        System.out.println(maxFrequencyElements2(new int[]{1,2,3,4,5,5}));
    }
    public static int maxFrequencyElements2(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int max = 0;

        for (int num : nums) {
            int freq = freqMap.getOrDefault(num, 0) + 1;
            freqMap.put(num, freq);
            max = Math.max(max, freq);
        }

        int ans = 0;
        for (int freq : freqMap.values()) {
            if (freq == max) {
                ans += freq;
            }
        }
        return ans;
    }

    public static int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freqMap = freqOfEachElement(nums);
        int max=0;
        for (var value:freqMap.values()){
            if (value>max) max=value;
        }
        int ans=0;
        for (var value:freqMap.values()){
            if (value==max) ans+=value;
        }
        return ans;
    }
    public static  Map<Integer,Integer> freqOfEachElement(int [] nums){
        Map<Integer,Integer> map=new HashMap<>();

        for (int num:nums){
            if (map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else {
                map.put(num,1);
            }
        }
        return map;
    }
}
