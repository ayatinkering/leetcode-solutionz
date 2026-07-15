class Solution {
    int ans=0;
    public int longestZigZag(TreeNode root) {
        dfs(root.left,true,1);
        dfs(root.right,false,1);
        return ans;
    }
    public void dfs(TreeNode root,boolean cameFromLeft, int count){
        if(root==null) return ;

        ans=Math.max(ans,count);

        if(cameFromLeft){
            dfs(root.right,false,count+1); //CONTINUE zigzag
            dfs(root.left,true,1); //RESTART
        }
        else{
            dfs(root.left,true,count+1);
            dfs(root.right,false,1);
        }

    }
}