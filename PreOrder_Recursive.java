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
    List<Integer> out = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null)
            return out;
        preorder(root);
        return out;
    }
    public void preorder(TreeNode root)
    {
        if(root==null)
            return;
        out.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
}
