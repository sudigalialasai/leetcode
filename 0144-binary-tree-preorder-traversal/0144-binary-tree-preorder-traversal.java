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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> l=new ArrayList<>();
        tree(root,l);
      
        return l;
    }
    public void tree(TreeNode root,List<Integer> l){
        if(root==null) return ;
        else{
            l.add(root.val);
            tree(root.left,l);
            tree(root.right,l);
            
        }
    }
}