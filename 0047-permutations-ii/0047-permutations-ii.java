class Solution {
    void fun(int[] nums , HashSet<List<Integer>> set,List<Integer> list, int idx , int n , boolean[] used){
        if(idx==n){
            set.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]){
                continue;
            }
            used[i] = true;
            int a = nums[i];
            list.add(a);
            fun(nums, set, list, idx+1, n, used);
            list.remove(list.size()-1);
            used[i] = false;
        }
        return;
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        HashSet<List<Integer>> set = new HashSet<>();
        fun(nums, set, list, 0, nums.length, used);
        for(List<Integer> key : set){
            res.add(new ArrayList<>(key));
        }
        return res;

        
    }
}