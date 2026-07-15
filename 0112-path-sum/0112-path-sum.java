/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root,targetSum);
    }
    public boolean dfs(TreeNode root, int remaining){
        if(root==null) return false;
        if(root.left==null & root.right==null & remaining==root.val)
             return true; //ONLY LEAF allowed to complete path
        
        remaining-=root.val;
        return dfs(root.left,remaining) || dfs(root.right,remaining);

    }
}