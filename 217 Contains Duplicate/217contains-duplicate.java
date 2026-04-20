class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        HashSet<Integer> ans = new HashSet<>();
        for(int i=0;i<n;i++){
            if(ans.contains(nums[i]))
                return true;
            ans.add(nums[i]);
        }
        return false;
    }
}