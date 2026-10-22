class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<Pair>> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<times.length;i++){
            int u = times[i][0];
            int v = times[i][1];
            int w = times[i][2];

            list.get(u-1).add(new Pair(v-1 , w));
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a , b) -> {
                if(a.weight != b.weight){
                   return Integer.compare(a.weight , b.weight);
                }
                return Integer.compare(a.des, b.des);
            }
        );
        List<Integer> list2 = new ArrayList<>();
        for(int i=0;i<n;i++){
            list2.add(Integer.MAX_VALUE);
        }
        list2.set(k-1 , 0);
        pq.add(new Pair(k-1 , 0));
        while(!pq.isEmpty()){
            Pair p = pq.poll();
            int node = p.des;
            int d = p.weight;
            if(d>list2.get(node)){
                continue;
            }
            for(int i=0;i<list.get(node).size();i++){
                int neigh = list.get(node).get(i).des;
                int wt = list.get(node).get(i).weight;
                if(d+wt < list2.get(neigh)){
                    list2.set(neigh , d+wt);
                    pq.add(new Pair(neigh , d+wt));
                }
            }
        }
        int max = 0;
        for(int i=0;i<list2.size();i++){
            max = Math.max(max , list2.get(i));
        }
        if(max == Integer.MAX_VALUE){
            return -1;
        }
        return max;
    }
    class Pair{
        int des;
        int weight;
        Pair(int des , int weight){
            this.des = des;
            this.weight = weight;
        }
    }
}