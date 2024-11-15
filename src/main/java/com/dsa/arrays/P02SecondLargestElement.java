package src.main.java.com.dsa.arrays;
public class P02SecondLargestElement {
    public static void main(String[] args) {
        int []arr={10,5,20,8,34,13,56,21,45};
        System.out.println(secondLargest2(arr));
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
    static int secondLargest(int [] arr){
        int largest=largestIndex2(arr);
        int ans=-1;
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=arr[largest]){
                //Now taking consideration for 2nd largest
                if (ans==-1){
                    ans=i;
                }else if(arr[i]>arr[ans]){
                    ans=i;
                }
            }
        }
        return ans;
    }
    static int secondLargest2(int [] arr){
        int largest=0;// assuming start as largest index
        int ans=-1;
        for (int i=1;i<arr.length;i++){
            if (arr[i]>arr[largest]){
                ans=largest;
                largest=i;
            } else if (arr[i]!=arr[largest]) {// this is condition only consider elements that are distinct else he code might mistakenly set ans to one of these occurrences
                if (ans==-1 || arr[i]>arr[ans]){
                    ans=i;
                }
            }
            // if arr[i]==arr[largest] it won't do anything as it is duplicate value
        }
        return ans;
    }
}
