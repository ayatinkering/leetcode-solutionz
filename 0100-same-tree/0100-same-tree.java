class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;  //both trees end at same place
        if(p==null || q==null) return false; //BOTH arent null, diff distributed nodes
        
        if(p.val!=q.val) return false;   //if neither are null but values diff
        return (isSameTree(p.left,q.left) && isSameTree(p.right,q.right)); //if values same
    }
}