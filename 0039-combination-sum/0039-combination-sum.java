class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> subset=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        dfs(candidates,0,subset,ans,target);
        return ans;
    }
    public void dfs(int[] candidates,int i,List<Integer> subset,List<List<Integer>> ans, int remaining){
        if(i>=candidates.length){ //all subsets seen, nothing left
            return;
        }
        if(remaining==0){
            ans.add(new ArrayList<>(subset)); //IF SUBSET with sum found
            return;
        }

        if(candidates[i]<=remaining){ //TAKE current ele
            subset.add(candidates[i]);
            dfs(candidates,i,subset,ans,remaining-candidates[i]);
            subset.remove(subset.size()-1); //backtrack
        }
        dfs(candidates,i+1,subset,ans,remaining); //DONT TAKE current ele, go next 
    }
}