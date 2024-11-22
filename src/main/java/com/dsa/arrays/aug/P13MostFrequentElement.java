package src.main.java.com.dsa.arrays.aug;

public class P13MostFrequentElement {
    public static void main(String[] args) {
        int [] arr={3,4,2,12,2,3,4,3,2,1};
        System.out.println(mostFrequentBrutForce(arr));
    }
    private static int mostFrequentBrutForce(int [] arr){
        int ans=-1;
        int ansFreq=-1;
        for (int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    count++;
                }
            }
            // update ans if we have higher frequency
            if (count>ansFreq){
                ansFreq=count;
                ans=arr[i];
            }
        }
        return ans;
    }
}
