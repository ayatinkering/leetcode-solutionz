class Solution {

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        dfs(root, targetSum, path, ans);
        return ans;
    }

    public void dfs(TreeNode root,int remaining,
                    List<Integer> path, //passing in CURRENT PATH and total ans
                    List<List<Integer>> ans) {

        if (root == null) return; //ENDS

        path.add(root.val);          // choose current node

        remaining -= root.val;
        if (root.left == null && root.right == null && remaining == 0) 
            ans.add(new ArrayList<>(path)); //TRUE, corrent path save a COPY
        

        dfs(root.left, remaining, path, ans); //do same on left,right
        dfs(root.right, remaining, path, ans);
        path.remove(path.size() - 1); // undo choice (backtrack) remove LAST PATH, GO UP AND CONTINUE
    }
}