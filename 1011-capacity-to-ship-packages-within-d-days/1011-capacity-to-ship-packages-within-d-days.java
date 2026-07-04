class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int maxw=0; int sumw=0;
        for(int i=0;i<weights.length;i++){
            if(weights[i]>maxw) maxw=weights[i];
            sumw+=weights[i];
        }
        int ans=0;int curr;
        int l=maxw; int r=sumw; int cap=0;
        while(l<=r){
            int d=1;
            cap=l+(r-l)/2;
            curr=0;
            for(int i:weights){
                if(curr+i<=cap){
                    curr+=i; 
                }else{
                    curr=i;
                    d++;
                }
            }
            if(d<=days) {
                ans=cap;
                r=cap-1;
            }
            else if (d>days){
                l=cap+1;
            }
        }
        return ans;
    }
}