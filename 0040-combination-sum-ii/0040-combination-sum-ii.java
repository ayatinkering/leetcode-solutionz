public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> subset=new ArrayList<>();
     
        Arrays.sort(candidates);
        dfs(candidates,0, subset, ans, target);
        return ans;
    }

    public void dfs(int[] candidates,int i,List<Integer> subset, List<List<Integer>> ans, int rem) {
        if (rem==0) {
            ans.add(new ArrayList<>(subset));
            return;
        }
        if (i == candidates.length) { //numbers over
            return;
        }

        if(candidates[i]<=rem){ //TAKE IT
            subset.add(candidates[i]);
            dfs(candidates, i + 1, subset, ans, rem-candidates[i]);
            subset.remove(subset.size() - 1);
        }
        
        while (i+1<candidates.length && candidates[i] == candidates[i + 1]) {
            i++;
        }

        dfs(candidates, i + 1, subset, ans, rem); //DONT TAKE
    }
}