public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> subset=new ArrayList<>();
     
        Arrays.sort(candidates); //to get duplicates togetehr
        dfs(candidates,0, subset, ans, target);
        return ans;
    }

    public void dfs(int[] nums,int i,List<Integer> subset, List<List<Integer>> ans, int rem) {
        if (rem==0) {
            ans.add(new ArrayList<>(subset)); //combination found
            return;
        }
        if (i>=nums.length) return; //numbers over

        if(nums[i]<=rem){ //TAKE IT
            subset.add(nums[i]);
            dfs(nums, i + 1, subset, ans, rem-nums[i]);
            subset.remove(subset.size() - 1);
        }
        
        while (i+1<nums.length && nums[i]==nums[i + 1]) {
            i++; //increments i to ignore duplicates, only then start the NEXT BRANCHES
        }
        dfs(nums, i+1, subset, ans, rem); //DONT TAKE
    }
}