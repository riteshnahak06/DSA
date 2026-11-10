package src.main.java.com.dsa.sorting;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr={64, 25, 12, 22, 11};
        mergeSort(arr,0,arr.length-1);
    }

    private static void mergeSort(int[] arr,int left,int right) {
        //64, 25, 12, 22, 11
        while (left<right){
            int mid=left+(right-left)/2; //
            mergeSort(arr,left,mid); // 64, 25, 12
            mergeSort(arr,mid+1,right); //22, 11
            mergeFunc(arr,left,right,mid);
        }

    }

    private static void mergeFunc(int[] arr, int left, int right, int mid) {
        int leftArrSize=mid-left;
        int rightArrSize=right-mid+1;

        int [] leftArr=new int[leftArrSize];
        int [] rightArr=new int[rightArrSize];

        for ( int  i = 0; i < leftArrSize; i++) {
            leftArr[i]=arr[i];
        }
        for ( int  i = leftArrSize; i <rightArrSize; i++) {
            rightArr[i]=arr[i];
        }
        // if both left and right has same size





    }
}
