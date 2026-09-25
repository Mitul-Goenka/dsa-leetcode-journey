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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        return fun(root , targetSum);
    }
    boolean fun(TreeNode root , int targetSum){
        if(root==null){
            return false;
        }
        int sum = 0;
        sum+=root.val;
        if(root.left==null && root.right==null){
        if(sum==targetSum){
            return true;
        }
    }
        boolean left = fun(root.left , targetSum-sum);
        boolean right = fun(root.right ,targetSum-sum);
        return left || right;
    }
}