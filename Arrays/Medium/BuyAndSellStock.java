// Given an array arr of n integers, where arr[i] represents price of the stock on the ith day. Determine the maximum profit achievable by buying and selling the stock at most once. 
// The stock should be purchased before selling it, and both actions cannot occur on the same day.

public class BuyAndSellStock {
    public int stockBuySell(int[] arr, int n) {
        int minPrice = arr[0];
        int maxProfit = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] < minPrice) {
                minPrice = arr[i];
            } else {
                int profit = arr[i] - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {10, 7, 5, 8, 11, 9};
        BuyAndSellStock solution = new BuyAndSellStock();
        System.out.println(solution.stockBuySell(prices, prices.length));
    }
}
