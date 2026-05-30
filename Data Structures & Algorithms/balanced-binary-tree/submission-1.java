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
    boolean result;
    public boolean isBalanced(TreeNode root) {
        result = true;
        height(root);
        return result;

    }
    public int height(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        int l = height(root.left) ;
        int r = height(root.right);

        if(Math.abs(l-r)>1)
            result = false;

        return Math.max(l, r) + 1;
        
        
    }
}
