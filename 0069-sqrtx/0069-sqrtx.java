class Solution {
    public int mySqrt(int x) {
        int l=0;int r=x;int mid=0;
        while(l<=r){
            mid=l+(r-l)/2;
            if(x<(long)mid*mid) r=mid-1;
            else if (x>(long)mid*mid) l=mid+1;
            else return mid;
        }
        return r;
    }
}