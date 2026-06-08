class Solution {
    public int maxProfit(int[] prices) {
        int sum=0; int j;
        for(int i=0;i<prices.length-1;i++){
            j=i+1;
            if(prices[j]>prices[i])
                sum+= prices[j]-prices[i];
        }
        return sum;
    }
}