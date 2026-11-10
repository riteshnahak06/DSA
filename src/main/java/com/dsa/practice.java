package src.main.java.com.dsa;

import java.util.*;

public class practice {
    public static void main(String[] args) {
//        int [] arr={2,1,5,1,3,2};
//        String str="abciiidef";
//        System.out.println(maxSumWithFixedWindow(arr,3));
//        System.out.println(maxVowelWithFixedWindow(str,3));
          String s="cbaebabacd", p = "abc";
        System.out.println(anagramIndex(s,p));
    }

    private static List<Integer> anagramIndex(String s, String p) {
        int i=0,j=0;
       List<Integer> res=new ArrayList<>();

       while (j<s.length()){

           if (j-i+1<p.length()){
               j++;
           }else if (j-i+1==p.length()){
               if (isAnagram(i,j,s,p)){
                   res.add(i);
               }
               i++;
               j++;
           }
       }
       return res;
    }

//    private static boolean isAnagram(int i, int j, String s, String p) {
//        String sub = s.substring(i, j + 1);
//        char[] arr1 = sub.toCharArray();
//        char[] arr2 = p.toCharArray();
//
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//
//        return Arrays.equals(arr1, arr2);
//    }
private static boolean isAnagram(int i, int j, String s, String p) {

    int[] freq = new int[26];

    for (int k = 0; k < p.length(); k++) {
        freq[p.charAt(k) - 'a']++;
    }

    for (int k = i; k <= j; k++) {
        freq[s.charAt(k) - 'a']--;
    }

    for (int count : freq) {
        if (count != 0) {
            return false;
        }
    }

    return true;
}

    private static int maxVowelWithFixedWindow(String str, int k) {
        int i=0;
        int j=0;
        int count=0;
        int maxCount=Integer.MIN_VALUE;

        while (j<str.length()){
            if (isVowl(str.charAt(j))){
                count++;
            }
            if (j-i+1<k){
                j++;
            } else if (j-i+1==k) {
                maxCount=Integer.max(count,maxCount);
                if (isVowl(str.charAt(i))) count--;
                i++;
                j++;
            }
        }
        return maxCount;

    }

    private static boolean isVowl(char c) {
        return "aeiou".indexOf(c) >= 0;
    }

    private static int maxSumWithFixedWindow(int[] arr, int k) {
        int i=0; int j=0;
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        while (j<arr.length){
            sum+=arr[i];
            if (j-i+1<k){
                j++;
            } else if (j-i+1==k) {
                maxSum=Math.max(sum,maxSum);
                sum-=arr[i++];
                j++;
            }
        }
        return maxSum;

    }

    private static int [] pairSum(int[] arr1, int target) {
        // create a hasmap which will have value and index
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            int compliment=target-arr1[i];
            if (hm.containsKey(compliment)){
                return new int []{i,hm.get(compliment)};
            }else {
                hm.put(arr1[i],i);
            }
        }
        return new int []{-1,-1};

    }

    private static void moveZeroToend(int[] arr1) {
        int start=0;int end = arr1.length-1;
        while (start < end) {
            if (arr1[start] != 0) {
                start++;
            } else if (arr1[end] == 0) {
                end--;
            } else {
                swapArra(arr1, start, end);
                start++;
                end--;
            }
        }
    }

    private static void swapArra(int[] arr1, int start, int end) {
        for (int i=0;i< arr1.length;i++){
            int temp=arr1[start];
            arr1[start]=arr1[end];
            arr1[end]=temp;
        }
    }



    private static void mergeShortedArray(int[] arr1, int[] arr2) {
        int [] arr3=new int[arr1.length+arr2.length];
        int i=0;
        int j=0;
        int k=0;
        while (i<arr1.length && j<arr2.length){
            if (arr1[i]<arr2[j]){
                arr3[k++]=arr1[i++];
            }else {
                arr3[k++]=arr2[j++];
            }
        }
        while (i<arr1.length){
            arr3[k++]=arr1[i++];
        }
        while (j<arr2.length){
            arr3[k++]=arr2[j++];
        }
        System.out.println(Arrays.toString(arr3));
    }

    private static void extractMaxMin(int[] arr) {
        int maxIndex=0;
        int secondMaxIndex=-1;
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]>arr[maxIndex]){
                secondMaxIndex=maxIndex;
                maxIndex=i;
            } else if (arr[i]!=arr[maxIndex]) {
                if (secondMaxIndex==-1||arr[i]>arr[secondMaxIndex]){
                    secondMaxIndex=i;
                }
            }
        }
        System.out.println("max "+maxIndex+ " secondMax  "+secondMaxIndex);

    }
}
