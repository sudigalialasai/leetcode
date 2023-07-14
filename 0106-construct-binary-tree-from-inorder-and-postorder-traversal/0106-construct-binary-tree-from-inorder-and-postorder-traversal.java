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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
     
        Map<Integer,Integer> m=new HashMap<>();

        for(int i=0;i<inorder.length;++i){
            m.put(inorder[i],i);
        }

        return bulid(postorder,0,postorder.length-1,inorder,0,inorder.length-1, m);

        
    }
    TreeNode bulid(int[] preorder,int pmin,int pmax,int[] inorder,int imin,int imax,Map<Integer,Integer> m){
        if(pmin>pmax || imin>imax) return null;
        TreeNode root=new TreeNode(preorder[pmax]);
        int val1=m.get(root.val);
        int val=val1-imin;
        root.left=bulid(preorder,pmin,pmin+val-1,inorder,imin,val1-1, m);
        root.right=bulid(preorder,pmin+val,pmax-1,inorder,val1+1,imax, m);
        return root;
    }
}
    