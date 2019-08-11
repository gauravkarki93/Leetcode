/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preOrder = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if(root != null)
            stack.add(root);
        
        while(!stack.empty())
        {
            TreeNode top = stack.pop();
            preOrder.add(top.val);            
            if(top.right != null)            
                stack.push(top.right);                         
            if(top.left != null)
                stack.push(top.left);
        }
        return preOrder;
    }  
}
