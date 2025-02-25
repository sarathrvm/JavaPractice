package Array;

public class StocksToBuyAndSell_LC121 {
    public static void main(String[] args) {

        int[] arr ={1,2,9,3,11,8};

        System.out.println(maxProfit(arr));

    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minSofar = prices[0];

        for(int i=0;i<prices.length;i++){
            minSofar = Math.min(minSofar,prices[i]);
            maxProfit = Math.max(maxProfit,(prices[i]-minSofar));
        }

        return maxProfit;

    }
}
