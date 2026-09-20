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
    public int kthSmallest(TreeNode root, int k) {
        List<TreeNode> list2 = fun(root);
        
        TreeNode node = list2.get(k-1);
        
        return node.val;
    }
    List<TreeNode> fun(TreeNode root){
        List<TreeNode> list = new ArrayList<>();
        if(root==null){
            return new ArrayList<>();
        }
        list.addAll(fun(root.left));
        list.add(root);
        list.addAll(fun(root.right));
        return list;
    }
}