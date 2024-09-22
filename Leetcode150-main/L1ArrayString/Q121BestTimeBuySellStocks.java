//kadane's Algorithm


package L1ArrayString;

public class Q121BestTimeBuySellStocks {

    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        Q121BestTimeBuySellStocks obj = new Q121BestTimeBuySellStocks();
        System.out.println(obj.maxProfit(prices));
        // Output: 5

        int[] prices2 = { 7, 6, 4, 3, 1 };
        System.out.println(obj.maxProfit(prices2)); // Output: 0
    }
}
