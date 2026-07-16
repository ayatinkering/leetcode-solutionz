public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> perm = new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        boolean[] picked=new boolean[nums.length];

        backtrack(perm, ans, nums, picked);
        return ans;
    }

    public void backtrack(List<Integer> perm, List<List<Integer>> ans, int[] nums, boolean[] picked) {
        if (perm.size() == nums.length) { //permutation over
            ans.add(new ArrayList<>(perm));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!picked[i]) { //available
                perm.add(nums[i]);
                picked[i] = true; //alr used, so TRUE

                backtrack(perm, ans, nums, picked); //continue adding to that perm

                perm.remove(perm.size() - 1); //backtrack
                picked[i] = false;
            }
        }
    }
}