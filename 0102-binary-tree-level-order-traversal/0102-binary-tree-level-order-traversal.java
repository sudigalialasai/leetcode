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
class pair{
    TreeNode root;
    int level;
    
    pair(TreeNode _root,int _level){
        root=_root;
        level=_level;
        
    }
}
class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {
       
        List<List<Integer>> lm=new ArrayList<>();
        if(root==null) return lm;
        Queue<pair> q=new LinkedList<>();
        q.offer(new pair(root,0));
            while(!q.isEmpty()){
                int n=q.size();
                List<Integer> l=new ArrayList<>();
            for(int i=0;i<n;++i){
                pair p=q.peek();
                int level=p.level;
                root=p.root;
                l.add(root.val);
                q.poll();
                
                if(root.left!=null) q.offer(new pair(root.left,level+1));
                if(root.right!=null) q.offer(new pair(root.right,level+1));
                        
            }
            lm.add(l);           
            }
            return lm;
        
    }
}