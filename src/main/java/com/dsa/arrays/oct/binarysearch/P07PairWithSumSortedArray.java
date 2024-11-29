package src.main.java.com.dsa.arrays.oct.binarysearch;
/*
int [] arr={2,5,8,12,30};
        int sum=17;
        return true as 5+12=17
 */
public class P07PairWithSumSortedArray {
    public static void main(String[] args) {
        int [] arr={2,5,8,12,30};
        int target=7;
        System.out.println(pairSumSortedBrutForce(arr,target));
    }

    private static boolean pairSumSortedBrutForce(int[] arr, int target) {
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==target){
                    return true;
                }
            }
        }
        return false;
    }


}
