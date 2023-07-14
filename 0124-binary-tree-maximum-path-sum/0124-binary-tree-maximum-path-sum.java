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
    public int maxPathSum(TreeNode root) {
        int[]result=new int[1];
        result[0]=Integer.MIN_VALUE;
        finder(root,result);
        return result[0];
        
    }

    public int finder(TreeNode root,int[] result){
        if(root==null) return 0;
        int lf=Math.max(0,finder(root.left,result));
        int rf=Math.max(0,finder(root.right,result));

        result[0]=Math.max(result[0],lf+rf+root.val);
        return root.val+Math.max(lf,rf);
    }

}