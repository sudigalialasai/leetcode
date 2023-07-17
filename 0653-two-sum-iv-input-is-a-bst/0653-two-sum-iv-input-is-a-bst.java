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

  
 /*class BSTIterator {
    Stack<TreeNode> st1;
    Stack<TreeNode> st2;

    public BSTIterator(TreeNode root) {
        st1=new Stack<TreeNode>();
        st2=new Stack<TreeNode>();
        TreeNode link=root; 
        while(root!=null) {
            st1.push(root);
            root=root.left;        
    }
        while(link!=null){
              st2.push(link);
              link=link.right;
        }
    }
    
    public Integer next() {
        TreeNode top=null;
        if(!st1.isEmpty()){
            top=st1.pop();}
            if(top==null) return null;
            TreeNode temp=top.right;
         
            while(temp!=null){
                st1.push(temp);
                temp=temp.left;
            }

          return top.val;  
        }

    public Integer previous(){
        TreeNode top=null;
        if(!st2.isEmpty()){
            top=st2.pop();}
            if(top==null) return null;
            TreeNode temp=top.left;
         
            while(temp!=null){
                st2.push(temp);
                temp=temp.right;
            }

          return top.val;  

    }

 }
public class  Solution {

    public boolean  findTarget(TreeNode root, int k) {
        BSTIterator b=new BSTIterator(root);
        Integer left=b.next();
        Integer right=b.previous();
        while(left!=right){
            if(left==null || right==null) break;
            if(left+right==k) return true;
          
            else if(left+right>k) right=b.previous();
            else{
                left=b.next();
            }
        }
       return false;
        
    }
     
}*/

import java.util.HashSet;
import java.util.Stack;

class BSTIterator {
    Stack<TreeNode> stack;

    public BSTIterator(TreeNode root) {
        stack = new Stack<>();
        TreeNode node = root;
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    public int next() {
        TreeNode node = stack.pop();
        int val = node.val;
        node = node.right;
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
        return val;
    }
}

public class Solution {
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<>();
        BSTIterator b = new BSTIterator(root);

        while (b.hasNext()) {
            int val = b.next();
            if (set.contains(k - val)) {
                return true;
            }
            set.add(val);
        }

        return false;
    }
}
