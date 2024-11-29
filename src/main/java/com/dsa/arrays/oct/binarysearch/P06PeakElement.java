package src.main.java.com.dsa.arrays.oct.binarysearch;
/*
peak element = number is bigger than from both the surrounding
 */
public class P06PeakElement {
    public static void main(String[] args) {
        int [] arr={1,10,20,108,15,55};
        System.out.println(peakElementBrut(arr));
    }

    private static int peakElementOptimized(int [] arr){
        int start=0;
        int end=arr.length-1;
        int n=arr.length-1;
        return -1;
    }
    private static int peakElementBrut(int[] arr){
        for (int i=0;i<arr.length;i++){
            if (i==0){
                if (arr[i]>arr[i+1]) return i;
            }
            if(i==arr.length-1) {
                if (arr[i]>arr[i-1]) return  i;
            }
            if (i>0 && i<arr.length){
                if (arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                    return i;
                }
            }
        }
        return -1;
    }
}
