package src.main.java.com.dsa.arrays.oct.binarysearch;

public class P03CountOccurrences {
    public static void main(String[] args) {
        int [] arr={1,10,10,10,20,20,20,40};
        System.out.println(countOccurrences(arr,40));
    }

    private static int countOccurrences(int[] arr, int target) {
        System.out.println("fiest "+firstOccurrence(arr,target));
        System.out.println("last "+lastOccurrence(arr,target));
        return (lastOccurrence(arr,target)-firstOccurrence(arr,target))+1;
    }

    private static int firstOccurrence(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (target>arr[mid]){
                start=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;
            }else {
                if (mid==0 || arr[mid-1]!=arr[mid]){
                    return mid;
                }else {
                    // for duplicate value
                    end= mid-1;
                }
            }
        }
        return -1;
    }

    private static int lastOccurrence(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        int result=-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (target>arr[mid]){
                start=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;
            }else {
                result=mid;

                start=mid+1;
            }
        }
        return result;
    }
}
