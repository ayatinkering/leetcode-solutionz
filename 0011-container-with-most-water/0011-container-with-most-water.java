class Solution {
    public int maxArea(int[] height) {
        int l=0;int r=height.length-1;int area=0;int max=0;
        while(l<r){
            area=(r-l)*Math.min(height[l],height[r]);
            if(area>max) max=area;
            if(height[l]<height[r]) l++;
            else r--;
        }
        return max;
    }
}