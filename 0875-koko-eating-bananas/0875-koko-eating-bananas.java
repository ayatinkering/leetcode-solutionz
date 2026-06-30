class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxPile=piles[0];
        for(int i=1;i<piles.length;i++){
            if (piles[i]>maxPile) maxPile=piles[i];
        }
        int l=1;int r=maxPile;//k can take on values from 1 to maxPile number,BIN SEARCH
        int ans=maxPile;
        while(l<=r){
            int mid=l+(r-l)/2; //now calc h for each k
            int hcalc=0;
            for (int p : piles) {
                hcalc += Math.ceil((double) p / mid); //plus 1 if lesser, plus ciel if greater

            }//BIN SEARCH with hcalc and given h
            if(hcalc<=h) {
                if (mid<ans) ans=mid; //still search left, as we want the MINIMUM ans
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
}