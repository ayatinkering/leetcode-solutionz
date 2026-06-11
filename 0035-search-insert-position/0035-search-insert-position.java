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
        //exits the loop when R LESSER THAN L, R is last position smaller than target
        // l is first pos LARGER than target
        //position=index+1 so l
        return l;
    }
}