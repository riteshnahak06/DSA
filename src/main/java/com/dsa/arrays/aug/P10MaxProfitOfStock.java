package src.main.java.com.dsa.arrays.aug;
/*
find max possible profit for buying and selling
 stock must bough before being sold
 */
public class P10MaxProfitOfStock {
    public static void main(String[] args) {
        int [] prices={7,5,3,6,4,2,1,44,1,34};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfitBrut(int[] prices) {
        int maxProfit=Integer.MIN_VALUE;
        for (int i=0;i<prices.length;i++){
            int currentProfit=0;
            for (int j=i;j<prices.length;j++){
                currentProfit=prices[j]-prices[i];
                maxProfit=Integer.max(currentProfit,maxProfit);
            }
        }
        return maxProfit;
    }

    private static int maxProfit(int[] arr){
        int maxProfit=0;
        int buyingPrice=0;
        for (int i=1;i<arr.length;i++){
            if (arr[i]-arr[buyingPrice]<maxProfit){
                buyingPrice=i;
            }else {
                maxProfit=arr[i]-arr[buyingPrice];
            }
        }
        return maxProfit;
    }
}
