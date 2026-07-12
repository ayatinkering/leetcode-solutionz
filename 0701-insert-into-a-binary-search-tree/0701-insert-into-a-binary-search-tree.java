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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode newnode=new TreeNode(val);
        TreeNode curr=root;
        if(curr==null) return newnode;
        while(curr!=null){
            if(val<curr.val) {
                if(curr.left!=null) curr=curr.left;
                else {
                    curr.left=newnode;
                    return root;}
            }
            else {
                if(curr.right!=null) curr=curr.right;
                else {
                    curr.right=newnode;
                    return root;}
            }
        }
        return root;
    }
}