class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        TreeNode current = root;

        while (current != null) {
            if (current.left == null) {
                inorder.add(current.val);
                current = current.right;
            } else {
                TreeNode predecessor = findPredecessor(current);
                if (predecessor.right == null) {
                    predecessor.right = current;
                    current = current.left;
                } else {
                    predecessor.right = null;
                    inorder.add(current.val);
                    current = current.right;
                }
            }
        }

        return inorder;
    }

    private TreeNode findPredecessor(TreeNode node) {
        TreeNode predecessor = node.left;
        while (predecessor.right != null && predecessor.right != node) {
            predecessor = predecessor.right;
        }
        return predecessor;
    }
}
