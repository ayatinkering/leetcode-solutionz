class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        Queue<TreeNode> q=new ArrayDeque<>();

        if(root==null) return list;
        q.offer(root);

        while(!q.isEmpty()){
            int size=q.size(); //no of nodes in THAT LEVEL

            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                if(i==size-1){
                    list.add(curr.val); //adding RIGHTMOST (LAST NODE) to rightlist
                }
                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
                
            }
        }
        return list;
    }
}