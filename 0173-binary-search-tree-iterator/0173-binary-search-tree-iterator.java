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
class BSTIterator {
    Stack<TreeNode> st;

    public BSTIterator(TreeNode root) {
        st=new Stack<TreeNode>(); 
        while(root!=null) {
            st.push(root);
            root=root.left;        
    }}
    
    public int next() {
        TreeNode top=null;
        if(!st.isEmpty()){
            top=st.pop();}
            if(top==null) return -1;
            TreeNode temp=top.right;
         
            while(temp!=null && temp!=null){
                st.push(temp);
                temp=temp.left;
            }

          return top.val;  
        }
        
        
    
    
    public boolean hasNext() {
        if(!st.isEmpty()) return true;
        return false;
        
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */