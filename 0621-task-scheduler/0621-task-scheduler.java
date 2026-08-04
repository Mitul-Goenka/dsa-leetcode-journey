class Solution {
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<Pair> pq = new PriorityQueue<>
        (
            (a,b) -> {
                if(b.freq!=a.freq){
                    return b.freq - a.freq;
                }
                return a.element - b.element;
            }
        );
        
         int time = 0;
        List<Pair> list = new ArrayList<>();
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i=0;i<tasks.length;i++){
            map.put(tasks[i] , map.getOrDefault(tasks[i] , 0)+1);
        }
        for(Map.Entry<Character , Integer> entry : map.entrySet()){
            pq.add(new Pair(entry.getValue() , entry.getKey()));
        }
        while(!pq.isEmpty()){
             int count = 0;
            for(int i=0;i<n+1;i++){
                if(!pq.isEmpty()){
                    Pair P = pq.poll();
                    P.freq--;
                    list.add(P);
                    count++;
                }
            }
            for(Pair P : list){
                if(P.freq>0){
                    pq.add(P);
                }
            }
            list.clear();
            if(!pq.isEmpty()){
                time += n+1;
            }
            else{
                time+=count;
            }
        }
        return time;
    }
}
class Pair{
    int freq;
    char element;
    Pair(int freq , char element){
        this.freq = freq;
        this.element = element;
    }
}
