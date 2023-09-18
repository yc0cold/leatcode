public class BestTimeToBuyAndSellStock2 {
    /* Top Interview Questions / Easy Collection - array */
    public int maxProfit(int[] prices) {
        int sum = 0;
        for (int i = 0; i < prices.length-1; i++) {
            if (prices[i] < prices[i + 1]) {
                sum += prices[i+1] - prices[i];
            }
        }
        System.out.println("sum = " + sum);

        return sum;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock2 b = new BestTimeToBuyAndSellStock2();

        int[] prices_1 = {7, 1, 5, 3, 6, 4};
        int[] prices_2 = {1, 2, 3, 4, 5};
        int[] prices_3 = {7, 6, 4, 3, 1};
        //b.maxProfit(prices_1);
        //b.maxProfit(prices_2);
        b.maxProfit(prices_3);

    }
}
