class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        if(nums.length==1){
            list.add(nums[0]);
            return list;
        }
        int min = nums[0];
        int max = nums[nums.length-1];
        int[] arr = new int[max];
        for(int j=0 , i=min;i<=max && j<max;i++ , j++){
            arr[j] = i; 
        }
        int k=0;
        int l=0;
        while(l<nums.length && k<arr.length){
            if(arr[k]==nums[l]){
                k++;
                l++;
            }
            else{
                list.add(arr[k]);
                k++;
            }
        }
        return list;
    }
}