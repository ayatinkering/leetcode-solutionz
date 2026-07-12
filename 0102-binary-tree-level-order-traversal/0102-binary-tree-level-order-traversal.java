class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null) return list;

        Queue<TreeNode> q=new ArrayDeque<>();
        q.offer(root);

        while(!q.isEmpty()){
            List<Integer> sublist=new ArrayList<>();
            int size=q.size(); //no of nodes in THAT LEVEL

            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                sublist.add(curr.val);
                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
            }
            list.add(sublist);
        }
        return list;
    }
}