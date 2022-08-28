public class BestTimeToBuyAndSellStock {
    // 121.Best Time to Buy and Sell Stock
    // category: greedy algorithm
    // Level: Easy
    public int maxProfit(int[] prices) {

        int minCurrent = prices[0];
        int maxCurrent = prices[0];
        int minFuture = prices[0];

        for(int i=1; i<prices.length; i++){

            int diff = maxCurrent - minCurrent;

            // set possible min in the future
            if(prices[i] < minCurrent && prices[i] < minFuture) {
                minFuture = prices[i];
            }
            // change min and max only if the difference of new max and minFutre is bigger than diff.
            if(prices[i]-minFuture > diff){
                minCurrent = minFuture;
                maxCurrent = prices[i];
            }

        }
        if(maxCurrent-minCurrent > 0){
            return maxCurrent-minCurrent;
        }else {
            return 0;
        }
    }


    // this code is simpler. src: https://siyoon210.tistory.com/94
    public int maxProfit2(int[] prices){
        int answer = 0;
        int length = prices.length;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }else {
                int i1 = prices[i] - minPrice;
                if (i1 > answer){
                    answer = i1;
                }
            }
        }
        return answer;
    }
}
