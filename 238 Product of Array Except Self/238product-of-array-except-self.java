class Solution {
    public int zeroprod(int[] nums) {
        int prod=1; int c=0;
        for(int i:nums){
            if(i!=0) c++;
        }
        if(nums.length-c > 1) return 0;
        else if (c>0) {
            for(int i:nums){
                if (i!=0) prod*=i;
            }
        } else return 0;
        return prod;
    }
        public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int prod=1;
        for(int i:nums){
            prod*=i;
        }

        for(int i=0;i<nums.length;i++){
            if (nums[i]==0) ans[i]=zeroprod(nums); 
            else ans[i]=prod/nums[i];
        }
        return ans;
    }

}