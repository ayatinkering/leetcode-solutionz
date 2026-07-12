class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        
        if(key<root.val) {
            root.left=deleteNode(root.left,key); //search left to delete
        }
        else if(key>root.val){
            root.right=deleteNode(root.right,key);
            //when found, returns the value of subteee w deleted, so assign that to right subtree
        }else{
            //node found
            //0. if no child, attach nothing
            if(root.left==null && root.right==null) return null;

            //1. 1 child
            else if(root.left!=null && root.right==null) return root.left;
            else if(root.left==null && root.right!=null) return root.right;

            //2. both children
            else{
            root.val=findInorderSucc(root.right); //replace w INORDER SUCC VALUE
            root.right=deleteNode(root.right,root.val); //delete inroder succ node
            }
        }
        return root;
    }

        public int findInorderSucc(TreeNode root){
            while(root.left!=null){
                root=root.left;
            }
            return root.val;
        }
}
    
