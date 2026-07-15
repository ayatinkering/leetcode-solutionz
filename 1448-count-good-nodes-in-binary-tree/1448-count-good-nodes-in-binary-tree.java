class Solution {
    public int goodNodes(TreeNode root) {
        return dfs(root,root.val); //max so far is the root value
    }
    public int dfs(TreeNode root, int maxSofar){
        int count=0;
        if(root==null) return 0; //runs for the root AT EACH NODE
        if(root.val>=maxSofar) count++;
        maxSofar=Math.max(root.val,maxSofar);
        count+=dfs(root.left,maxSofar);
        count+=dfs(root.right,maxSofar);
        return count;
    }
}