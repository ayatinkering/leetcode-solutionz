class Solution {
    
    boolean is=true;

    public boolean isBalanced(TreeNode root) {
        maxDepth(root);
        return is;
    }
    public int maxDepth(TreeNode root){
        if(root==null) return 0;
        int l=maxDepth(root.left);
        int r=maxDepth(root.right);

        if(Math.abs(l-r)>1){
            is=false;}

        return 1+Math.max(l,r);
    }
}