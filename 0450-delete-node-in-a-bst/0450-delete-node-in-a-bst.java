class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {

        if (root == null)
            return null;

        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        }

        else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        }

        else { // found node to delete

            // no left child
            if (root.left == null)
                return root.right;

            // no right child
            if (root.right == null)
                return root.left;

            // both children exist
            TreeNode min = findMin(root.right);
            root.val = min.val;
            root.right = deleteNode(root.right, min.val);
        }

        return root;
    }

    public TreeNode findMin(TreeNode root) {

        while (root.left != null)
            root = root.left;

        return root;
    }
}