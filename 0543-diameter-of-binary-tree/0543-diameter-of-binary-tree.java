class Solution {
    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;

        maxDepth(root);   // calculate depths, and max dia of each node
        return diameter;
    }    
    public int maxDepth(TreeNode root){
        if(root==null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        diameter=Math.max(diameter,left+right); //COMPUTE DIA also while computing depth
        return 1+Math.max(left,right);
    }
}