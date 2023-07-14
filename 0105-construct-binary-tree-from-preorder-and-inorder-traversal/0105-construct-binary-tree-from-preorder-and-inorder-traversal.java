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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> m=new HashMap<>();

        for(int i=0;i<inorder.length;++i){
            m.put(inorder[i],i);
        }

        return bulid(preorder,0,preorder.length-1,inorder,0,inorder.length-1, m);

        
    }
    TreeNode bulid(int[] preorder,int pmin,int pmax,int[] inorder,int imin,int imax,Map<Integer,Integer> m){
        if(pmin>pmax || imin>imax) return null;
        TreeNode root=new TreeNode(preorder[pmin]);
        int val1=m.get(root.val);
        int val=val1-imin;
        root.left=bulid(preorder,pmin+1,pmin+val,inorder,imin,val1-1, m);
        root.right=bulid(preorder,pmin+val+1,pmax,inorder,val1+1,imax, m);
        return root;
    }
}