class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int d=days;
        int maxw=weights[0]; int sum=0;
        for(int i:weights){
            if(i>maxw) maxw=i;
            sum+=i;
        }
        int ans=sum; //capacity has to be between max wieght and sum of all weights

        int l=maxw;int r=sum;  
        while(l<=r){
            int mid=l+(r-l)/2;
            int dcalc=1; int curr=0;
            for(int w:weights){
                if(curr+w<=mid){curr+=w;}
                else{
                    dcalc++; curr=0+w;
                }
            }
            if(dcalc<=d){ 
                ans=mid;
                r=mid-1;
            }else l=mid+1;
        }
        return ans;
    }
}