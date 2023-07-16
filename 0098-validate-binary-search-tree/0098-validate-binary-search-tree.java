/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
   
   
    boolean check(TreeNode root, Integer lower, Integer upper) {
        if (root == null) return true;

        int val = root.val;
 
        if ((lower != null && val <= lower) || (upper != null && val >= upper))
            return false;
 
        return check(root.left, lower, val) && check(root.right, val, upper);
    }

    public boolean isValidBST(TreeNode root) {
        return check(root, null, null);
    }
}

      
    
