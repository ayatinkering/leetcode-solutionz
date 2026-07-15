class Solution {
    public int sumNumbers(TreeNode root) {
        List<Integer> path=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();

        int sum=0;
        dfs(root,path,ans);
        for(List<Integer> sub:ans){
            for(Integer i=sub.size()-1;i>=0;i--){ 
                sum+=sub.get(i)*Math.pow(10,sub.size()-1-i);            
            }
        }
        return sum;
        
    }
    public void dfs(TreeNode root,List<Integer> path, List<List<Integer>> ans){
        if(root==null) return;

        path.add(root.val);

        if(root.left==null && root.right==null) 
            ans.add(new ArrayList<>(path)); //add COPY Of current list to ans
                                            //ADDS In backward order, from leaf
        
        dfs(root.left,path,ans);
        dfs(root.right,path,ans);
        path.remove(path.size()-1); //BACKTRACKING

    }
}