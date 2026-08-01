class Solution {
    public String reorganizeString(String s) {
        PriorityQueue<Pair> pq = new PriorityQueue<>
        (
            (a,b) -> {
                if(b.freq!=a.freq){
                    return b.freq - a.freq;
                }
                return b.word - a.word;
            }
        );
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i) , map.getOrDefault(s.charAt(i),0)+1);
        }
        for(Map.Entry<Character , Integer> entry : map.entrySet()){
            pq.add(new Pair(entry.getValue() , entry.getKey()));
        }
        StringBuilder res = new StringBuilder();
        int i=1;
        while(!pq.isEmpty()){
            Pair P = pq.poll();
            if(res.length()==0 || res.charAt(res.length() - 1)!=P.word){
                res.append(P.word);
                P.freq--;
                if(P.freq>0){
                    pq.add(P);
                }
            }
            else{
                if(pq.isEmpty()){
                    return "";
                }
                Pair P2 = pq.poll();
                res.append(P2.word);
                P2.freq--;
                if(P2.freq>0){
                    pq.add(P2);
                }
                pq.add(P);
            }
        }
        return res.toString();
    }
}
class Pair{
    int freq;
    char word;
    Pair(int freq , char word){
        this.freq = freq;
        this.word = word;
    }
}