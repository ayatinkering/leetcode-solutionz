class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> listans = new HashSet<>();
        Arrays.sort(nums); 

        for(int i=0;i<nums.length;i++){
            int l=i+1;int r=nums.length-1;
            int target=-nums[i];
            while(l<r){
                if(nums[l]+nums[r] > target)    
                    r--;
                else if (nums[l]+nums[r] < target)
                    l++;
                else {
                    ArrayList<Integer> ans=new ArrayList<>();
                    ans.add(nums[i]); 
                    ans.add(nums[l]); 
                    ans.add(nums[r]);
                    listans.add(ans); 
                    l++; r--; 
                }
            }
            
        }
        return new ArrayList<>(listans);
    }
}