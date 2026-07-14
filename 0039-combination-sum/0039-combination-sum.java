class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }

    private void backtrack(int[] arr, int remain, int idx, List<Integer> path, List<List<Integer>> ans) {
        // If remaining is 0, we found a valid combination
        if (remain == 0) {
            ans.add(new ArrayList<>(path)); // add a copy
            return;
        }
        // If we used all candidates or remaining negative -> stop
        if (idx == arr.length || remain < 0) return;

        // Option 1: take arr[idx] (we can take it again later, so idx stays the same)
        path.add(arr[idx]);
        backtrack(arr, remain - arr[idx], idx, path, ans);

        // Backtrack: remove last added element
        path.remove(path.size() - 1);

        // Option 2: skip current candidate and move to next
        backtrack(arr, remain, idx + 1, path, ans);
    }
}