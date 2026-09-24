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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> list1 = new ArrayList<>();
        fun(root , 0 , targetSum ,list1);
        return list;
    }
    List<List<Integer>> list = new ArrayList<>();
    void fun(TreeNode root , int sum , int targetSum , List<Integer> list1){
        
        if(root==null){
            return;
        }
        
        sum += root.val;
        list1.add(root.val);
        if(root.left==null && root.right==null){
            if(sum==targetSum){
                list.add(new ArrayList<>(list1));
                list1.remove(list1.size()-1);
                return;
            }
        }
        
            fun(root.left , sum , targetSum , list1);
            fun(root.right , sum , targetSum , list1);

            list1.remove(list1.size()-1);

            return;
    }
}