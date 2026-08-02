class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        Pair[] arr = new Pair[profits.length];
        for(int i=0;i<arr.length;i++){
            arr[i] = new Pair(capital[i] , profits[i]);
        }
        Arrays.sort(arr , (a,b)-> Integer.compare(a.cap,b.cap));
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
        int idx = 0;
        while(k>0){
        while(idx < arr.length){
            if(arr[idx].cap > w){
                break;
            }
            pq2.add(arr[idx].prof);
            idx++;
        }
        if(pq2.isEmpty()){
            return w;
        }
        w += pq2.poll();
        k--;
        }
    return w;
    }
}
class Pair{
    int cap;
    int prof;
    Pair(int cap , int prof){
        this.cap = cap;
        this.prof = prof;
    }
}