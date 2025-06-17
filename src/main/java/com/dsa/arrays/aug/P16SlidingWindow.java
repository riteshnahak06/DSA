package src.main.java.com.dsa.arrays.aug;

public class P16SlidingWindow {
    public static void main(String[] args) {
        sumOfAllSubArray(new int[] {2,3,1,4,1,3,5,2},3);
    }
    private static void sumOfAllSubArray(int[] arr,int k){
        for (int i=0;i<=arr.length-k;i++){
            int cs=0;
            for (int j=i;j<i+k;j++){
                cs+=arr[j];
            }
            System.out.println(cs);
        }
    }
}
