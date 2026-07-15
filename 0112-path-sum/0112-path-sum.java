class Solution {

    // Helper method to explore paths recursively while tracking running totals 🗺️
    public boolean helper(TreeNode node, int target, int curSum) {
        // Base Case 1: Empty node branch
        if (node == null) return false;
        
        // Base Case 2: Encountered a leaf node (no left or right children) 🎯
        if (node.left == null && node.right == null) {
            if (curSum + node.val == target) {
                return true; // Found a valid root-to-leaf path! 🎉
            }
        }
        
        // Accumulate current node's value to our running path total
        curSum += node.val;
        
        // Explore the left and right subtrees recursively
        return helper(node.left, target, curSum) || helper(node.right, target, curSum);
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        // Guard against an empty tree input
        if (root == null) return false;
        
        // Initiate the traversal with a starting sum of 0
        return helper(root, targetSum, 0);
    }
}
