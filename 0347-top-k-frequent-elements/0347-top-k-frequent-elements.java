class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>
        (
            (a,b) -> {
                if(a.freq != b.freq){
                    return a.freq-b.freq;
                }
                return a.ele-b.ele;
            }
        );
        for(int i=0;i<nums.length;i++){
            map.put(nums[i] , map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            pq.add(new Pair(entry.getValue() , entry.getKey()));
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[] freqele = new int[k];
        int i=0;
        while(!pq.isEmpty()){
            Pair P = pq.poll();
            freqele[i] = P.ele;
            i++;
        }
        return freqele;
    }
}
class Pair{
        int freq;
        int ele;
        Pair(int freq , int ele){
            this.freq = freq;
            this.ele = ele;
        }
    }