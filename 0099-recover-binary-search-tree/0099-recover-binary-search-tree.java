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
    public void recoverTree(TreeNode root) {
         List<TreeNode> list = fun(root);
         List<Integer> list2 = new ArrayList<>();
         for(int i=0;i<list.size()-1;i++){
            if(list.get(i).val > list.get(i+1).val){
                list2.add(i);
                list2.add(i+1);
            }
         }
         
         if(list2.size()==2){
            swap(list , list2.get(0) , list2.get(1));
         }
         if(list2.size()==4){
            swap(list , list2.get(0) , list2.get(3));
         }

         
    }
    List<TreeNode> fun(TreeNode root){
        if(root==null){
            return new ArrayList<>();
        }
        List<TreeNode> list1 = new ArrayList<>();
         list1.addAll(fun(root.left));
         list1.add(root);
         list1.addAll(fun(root.right));

         return list1;
    }
    void swap(List<TreeNode> list , int a , int b){
        int temp = list.get(a).val;
        list.get(a).val = list.get(b).val;
        list.get(b).val = temp;
    }
}