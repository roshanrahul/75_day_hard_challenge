package Day3;

public class BuySellStockBF {


    public static void main(String[] args) {
        int [] arr = {1,2};
        System.out.println(maxProfit(arr));

    }
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
        int ans = 0;
        for(int j = 0; j < n-1; j++){
            for(int i = j+1; i < n-1; i++){
                if(profit > ans)
                    ans = profit;

                if(prices[i]-prices[j] <= 0)
                    profit = 0;
                else
                    profit = prices[i]-prices[j];
            }
        }
        if(profit > ans)
            ans = profit;

        return ans;
    }
}
