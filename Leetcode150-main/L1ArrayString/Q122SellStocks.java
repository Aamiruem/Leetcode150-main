//greedy approach

package L1ArrayString;
import java.util.Arrays;
public class Q122SellStocks {

    public int fun(int[] prices, int i, int canBuy, int[][] dp) {
        if (i == prices.length) {
            return 0;
        }
        if (dp[i][canBuy] != -1) {
            return dp[i][canBuy];
        }

        int take, notTake;
        if (canBuy == 1) { // We can buy
            // Option to buy or skip
            take = -prices[i] + fun(prices, i + 1, 0, dp); // Buy and move to next day with canBuy = 0
            notTake = fun(prices, i + 1, 1, dp); // Skip buying and move to next day with canBuy = 1
        } else { // We can sell
            // Option to sell or skip
            take = prices[i] + fun(prices, i + 1, 1, dp); // Sell and move to next day with canBuy = 1
            notTake = fun(prices, i + 1, 0, dp); // Skip selling and move to next day with canBuy = 0
        }

        dp[i][canBuy] = Math.max(take, notTake);
        return dp[i][canBuy];
    }

    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        return fun(prices, 0, 1, dp); // Start from day 0 with the option to buy
    }
    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        Q122SellStocks obj = new Q122SellStocks();
        System.out.println(obj.maxProfit(prices));
        // Output: 7
    }

}





// package L1ArrayString;
// // import java.util.Arrays;

// public class Q122SellStocks {
//     public int maxProfit(int[] prices) {
//         int max = 0;
//         int start = prices[0];
//         int len = prices.length;
//         for (int i = 1; i < len; i++) {
//             if (start < prices[i]) {
//                 max += prices[i] - start;
//             }
//             start = prices[i];
//         }
//         return max;
//     }

//     public static void main(String[] args) {
//         int[] prices = { 7, 1, 5, 3, 6, 4 };
//         Q122SellStocks obj = new Q122SellStocks();
//         System.out.println(obj.maxProfit(prices));
//         // Output: 7
//     }
// }
