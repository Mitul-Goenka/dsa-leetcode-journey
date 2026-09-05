class Solution {
    void fun(int[] nums , HashMap<List<Integer> , Integer> map ,List<Integer> list, int idx , int n , boolean[] used){
        if(idx==n){
            map.put(new ArrayList<>(list) , map.getOrDefault(list , 0)+1);
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]){
                continue;
            }
            used[i] = true;
            int a = nums[i];
            list.add(a);
            fun(nums, map, list, idx+1, n, used);
            list.remove(list.size()-1);
            used[i] = false;
        }
        return;
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        HashMap<List<Integer> , Integer> map = new HashMap<>();
        fun(nums, map, list, 0, nums.length, used);
        for(List<Integer> key : map.keySet()){
            res.add(new ArrayList<>(key));
        }
        return res;

        
    }
}