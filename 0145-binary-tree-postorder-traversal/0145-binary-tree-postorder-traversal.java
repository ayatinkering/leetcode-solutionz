class Solution {

    List<Integer> ans = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {

        helper(root);

        return ans;
    }

    public void helper(TreeNode root){

        if(root == null)
            return;

        helper(root.left);

        helper(root.right);

        ans.add(root.val);
    }
}