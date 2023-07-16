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
    public TreeNode bstFromPreorder(int[] preorder) {
        int size=preorder.length-1;
        return bst(preorder,0,size);
        
    }
    TreeNode bst(int[] nums,int left,int right){
        if(left>right) return null;
        TreeNode root=new TreeNode(nums[left]);
        int check=left+1;
        while(check<=right && nums[check]<nums[left]){
           
                check++;
            } 
        
       
        root.left=bst(nums,left+1,check-1);
        root.right=bst(nums,check,right);

        return root;

    }
}