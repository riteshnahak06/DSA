package src.main.java.com.dsa.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        selectionSort(new int[]{64, 25, 12, 22, 11});
    }

    private static void selectionSort(int [] arr){
        //64, 25, 12, 22, 11
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }




        System.out.println(min(arr));


    }
    private static int min(int [] arr){
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min=arr[i];            }
        }
        return min;
    }
}
