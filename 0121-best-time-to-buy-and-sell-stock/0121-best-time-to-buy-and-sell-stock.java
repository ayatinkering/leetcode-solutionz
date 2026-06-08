class Solution {
    public int maxProfit(int[] prices) {
        int maxprof=0;int prof;
        int l=0;int r=1;
        while(r < prices.length){
            if(prices[r]>prices[l]) {
                prof=prices[r]-prices[l];
                if (prof>maxprof) maxprof=prof;
            }else
                l=r; //shift to the cheaper price for l
            r++;
        }
        return maxprof;
    }
}