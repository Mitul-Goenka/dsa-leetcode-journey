class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
         printPerm(nums , 0, res, list , used);
         return res;

    }
   void printPerm(int[] nums, int idx, List<List<Integer>> res, List<Integer> list,  boolean used[]){
        if(idx == nums.length){
            res.add(new ArrayList<>(list));
            return;
        } 
        for(int i=0;i<nums.length;i++){
            if(used[i]){
                continue;
            }
        used[i] = true;
        int a = nums[i];
        list.add(a);
        printPerm(nums , idx+1 , res , list , used);
        list.remove(list.size()-1);
        used[i] = false;
        }
    }
}