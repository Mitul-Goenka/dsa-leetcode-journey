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
    public boolean isValidBST(TreeNode root) {
        List<TreeNode> list1 = fun(root);
        int nums[] = new int[list1.size()];
        int i=0;
        for(TreeNode node : list1){
            nums[i] = node.val;
            i++;
        } 
        for(int j=1;j<nums.length;j++){
            if(nums[j]<=nums[j-1]){
                return false;
            }
        }
        return true;
        
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