package src.main.java.com.dsa.arrays.aug;

public class Practice {
    public static void main(String[] args) {
        System.out.println(secondLargest(new int[]{2,4,65,132,4,2,1}));
    }

    private static int secondLargest(int[] arr) {
        int max=0;
        int ans=-1;
        for (int i=1;i<arr.length;i++){
            if (arr[i]>arr[max]){
                ans=max;
                max=i;
            } else if (arr[i]!=arr[max]) {
                if (ans==-1 || arr[i]>arr[ans]){
                    ans=i;
                }
            }
        }
        return arr[ans];
    }
}
