package src.main.java.com.dsa.arrays.oct.binarysearch;

public class P01FirstOccurrenceIndex {
    public static void main(String[] args) {
        int [] arr={1,10,10,10,20,20,20,40};
        System.out.println(firstOccurrence(arr,20));
    }

    private static int firstOccurrence(int[] arr, int target) {
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
                // Found an occurrence, save the index
                result = mid;

                // Move to the left to look for the first occurrence
                end = mid - 1;
            }
        }
        return result;
    }
}
