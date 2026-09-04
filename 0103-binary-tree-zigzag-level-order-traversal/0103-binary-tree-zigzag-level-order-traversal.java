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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return new ArrayList<>();
        }
        q.add(root);
        int lvl=0;
        while(!q.isEmpty()){
            int lvlSize = q.size();
            List<Integer> list = new ArrayList<>();
            while(lvlSize>0){
                TreeNode curr = q.remove();
                list.add(curr.val);
                    if(curr.left!=null){
                        q.add(curr.left);
                    }
                    if(curr.right!=null){
                        q.add(curr.right);
                    }
                lvlSize--;
            }
            if(lvl%2!=0){
                    Collections.reverse(list);
                }
            lvl++;
            
            res.add(new ArrayList<>(list));
        }
        return res;
    }
}