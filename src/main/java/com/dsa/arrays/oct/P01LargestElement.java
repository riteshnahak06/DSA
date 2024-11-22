package src.main.java.com.dsa.arrays.oct;
public class P01LargestElement {
    public static void main(String[] args) {
        int []arr={10,5,20,8,34,13,56,21,45};
        System.out.println(largestIndex2(arr));
    }

    private static int largestIndex2(int[] arr) {
        int ans=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>arr[ans]){
                ans=i;
            }
        }
        return ans;
    }
    private static int largestIndex1(int[] arr) {
        for (int i=0;i<arr.length;i++){
            boolean flag=true;
            for(int j=0;j<arr.length;j++){
                //so as j is bigger than current so that's not ans
                if (arr[j]>arr[i]){
                    flag=false;
                    break;
                }
            }
            // if flag is not true go for another iteration of i
            if(flag==true){
                return i;
            }
        }
        return -1;
    }

}
