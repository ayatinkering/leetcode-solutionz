class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0;int r=nums.length-1;int mid=0;
        if(target<nums[0]) return 0;
        while(l<=r){
            mid=(l+r)/2;
            if(nums[mid]==target) return mid;
            if(target>nums[mid]) l=mid+1; 
            else r=mid-1;
        }
        return l;
    }
}