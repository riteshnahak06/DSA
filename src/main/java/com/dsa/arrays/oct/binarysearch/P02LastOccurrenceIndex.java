package src.main.java.com.dsa.arrays.oct.binarysearch;

public class P02LastOccurrenceIndex {
    public static void main(String[] args) {
        int [] arr={1,10,10,10,20,20,20,40};
        System.out.println(lastOccurrence(arr,20));
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


    // below code will give array out of bound exception for condition arr[mid+1]==arr[mid]
//    private static int lastOccurrence(int[] arr, int target) {
//        int start=0;
//        int end=arr.length-1;
//        while (start<=end){
//            int mid=start+(end-start)/2;
//            if (target>arr[mid]){
//                start=mid+1;
//            } else if (target<arr[mid]) {
//                end=mid-1;
//            }else {
//                if (arr[mid+1]==arr[mid]){
//                    start=mid+1;
//                }else {
//                    return mid;
//                }
//            }
//        }
//        return -1;
//    }
}
