class Solution {

    List<Integer> ans = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {

        helper(root);

        return ans;
    }

    public void helper(TreeNode root){

        if(root == null)
            return;

        ans.add(root.val);
        helper(root.left);
        helper(root.right);

    }
}