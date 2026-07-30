class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String , Integer> map = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>
        (
            (a,b) -> {
                if(a.second!=b.second){
                    return a.second - b.second;
                }
                return b.first.compareTo(a.first);
            }
        );
        for(int i=0;i<words.length;i++){
            map.put(words[i] , map.getOrDefault(words[i] , 0)+1);
        }
        List<String> list = new ArrayList<>();
        for(Map.Entry<String , Integer> entry : map.entrySet()){
            pq.add(new Pair(entry.getKey() , entry.getValue()));
            if(pq.size()>k){
                pq.poll();
            }
        }
        int i=0;
        while(!pq.isEmpty()){
            Pair P = pq.poll();
            list.add(P.first);
            i++;
        }
        Collections.reverse(list);
        return list;
    }
}
class Pair{
    String first;
    int second;
    Pair(String first , int second){
        this.first = first;
        this.second = second;
    }
}