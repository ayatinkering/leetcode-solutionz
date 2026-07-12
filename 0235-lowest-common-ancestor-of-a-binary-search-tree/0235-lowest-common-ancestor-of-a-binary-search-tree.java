class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode curr=root;
        while(curr!=null){
            if(p.val==curr.val || q.val==curr.val)
                return curr;
            if(p.val<curr.val && curr.val<q.val || p.val>curr.val && curr.val>q.val) //SPLIT
                return curr;
            if(p.val<curr.val && q.val<curr.val) curr=curr.left;
            else curr=curr.right;
        }
        return curr;
    }
}