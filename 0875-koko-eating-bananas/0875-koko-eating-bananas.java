class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxPile=piles[0];
        for(int i=1;i<piles.length;i++){
            if (piles[i]>maxPile) maxPile=piles[i];
        }
        int l=1;int r=maxPile;//k can take on values from 1 to maxPile number,BIN SEARCH
        int ans=0;
        while(l<=r){
            int mid=l+(r-l)/2; //now calc h for each k
            int hcalc=0;
            for(double p:piles){
                if(p<=mid) hcalc++;
                else hcalc+=Math.ceil(p/mid);
            }//BIN SEARCH with hcalc and given h
            if(hcalc<=h) {
                ans=mid; //still search left, as we want the minimum ans
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
}