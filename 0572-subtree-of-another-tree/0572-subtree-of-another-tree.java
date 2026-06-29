class Solution {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null) return false;
        if (isSameTree(root,subRoot)==true) return true;
        return isSubtree(root.left,subRoot) || isSubtree(root.right, subRoot);
    } //checking if same tree at root, then subtreee in left OR right

    public boolean isSameTree(TreeNode p, TreeNode q){
        if(p==null&&q==null) return true;
        if(p==null||q==null) return false;
        if(p.val!=q.val) return false;
        return (isSameTree(p.left,q.left) && isSameTree(p.right,q.right));
    }
}