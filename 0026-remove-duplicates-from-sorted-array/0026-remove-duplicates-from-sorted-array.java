class Solution {
    public int removeDuplicates(int[] nums) {
        int s = 0;int f = 1;int k = 1;

        while(f < nums.length){
            if(nums[f] != nums[s]){
                nums[k++] = nums[f];
                s = f;
            }
            f++;
        }
        return k;
    }
}