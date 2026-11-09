class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit =0;
        for (int i = 0; i<prices.length; i++) {
            int calculate = prices[i] - minPrice;
            if (calculate > maxProfit) {
                maxProfit = calculate;
            } else if (prices[i]<minPrice) {
                minPrice = prices[i];
            }
        }
        return maxProfit;
    }
}
