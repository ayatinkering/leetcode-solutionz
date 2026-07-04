class Solution {
    public int search(int[] nums, int target) {

        int l=0;int r = nums.length-1;
        while (l<=r) {
            int mid =l+(r-l)/2;
            if (nums[mid] == target) return mid;

            if (nums[l] <= nums[mid]) { //LEFT Part sorted
                if (nums[l]<=target && target<nums[mid]) 
                    r=mid-1; //target lies bw left and mid sorted part
                else //target lies in right sorted part
                    l=mid + 1;
            }

            else { //RIGHT PART SORTED
                if (nums[mid] < target && target <= nums[r]) //right of right part
                    l=mid+1;
                else  //target lies in left part
                    r=mid-1;
            }
        }
        return -1;
    }
}