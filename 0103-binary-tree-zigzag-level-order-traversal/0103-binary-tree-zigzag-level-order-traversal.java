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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int flag=0;
        List<List<Integer>> l=new ArrayList<>();
        if(root==null) return l;

        while(!q.isEmpty()){
           
            int n=q.size();
        List<Integer> m=new ArrayList<Integer>();
            for(int i=0;i<n;++i){
                  TreeNode t=q.peek();
                  if(t.left!=null) q.offer(t.left);
                  if(t.right!=null) q.offer(t.right);

                  m.add(t.val);
                  q.poll();
            }
            if(flag==0){
                l.add(m);
                flag=1;
            }
            else{
                Collections.reverse(m);
                l.add(m);
                flag=0;
            }

        }
        return l;
    }
}