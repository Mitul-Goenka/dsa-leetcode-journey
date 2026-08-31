class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        fun(candidates, candidates.length, target, list, res, 0, 0);
        return res;
    }
    void fun(int[] candidates, int n, int target, List<Integer> list, List<List<Integer>> res, int sum, int idx){
        if(idx==n){
            if(sum==target)
                res.add(new ArrayList<>(list));
            return;
        }
        fun(candidates, n, target, list, res, sum, idx+1);
        if(sum + candidates[idx] <= target){
            list.add(candidates[idx]);
            sum+=candidates[idx];
            fun(candidates, n, target, list, res, sum, idx);
            list.remove(list.size()-1);
            sum-=candidates[idx];
        }
        return;
    }
}