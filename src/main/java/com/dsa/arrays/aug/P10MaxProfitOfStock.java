package src.main.java.com.dsa.arrays.aug;
/*
find max possible profit for buying and selling
 stock must bough before being sold
 */
public class P10MaxProfitOfStock {
    public static void main(String[] args) {
        int [] prices={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfitBrut(int[] arr) {
        int maxProfit=0;
        for (int i=0;i<arr.length;i++){
            int costPrice=arr[i];
            for (int j=i;j<arr.length;j++){
                int profit=arr[j]-costPrice;
                maxProfit=Integer.max(profit,maxProfit);
            }
        }
        return maxProfit;
    }
    private static int maxProfit(int[] arr) {
        int maxProfit=0;
        int buyingPrice=arr[0];
        for (int i=1;i<arr.length;i++){
            maxProfit = Math.max(maxProfit, arr[i] - buyingPrice);
            buyingPrice = Math.min(buyingPrice, arr[i]);
        }
        return maxProfit;
    }


}
