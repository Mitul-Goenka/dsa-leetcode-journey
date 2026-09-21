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
    public int diameterOfBinaryTree(TreeNode root) {
        return fun(root);
    }
    int fun(TreeNode root){
        if(root==null){
            return 0;
        }
        int diam1 = fun(root.left);
        int diam2 = fun(root.right);
        int diam3 = height(root.left) + height(root.right);
        return Math.max(diam3 , Math.max(diam1 , diam2));
    }
    int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        int ans = Math.max(left , right)+1;
        return ans;
    }
}