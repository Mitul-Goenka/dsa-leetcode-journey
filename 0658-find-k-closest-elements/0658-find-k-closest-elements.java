class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>
        (
            (a,b) -> {
                if(b.diff!=a.diff){
                    return b.diff - a.diff;
                }
                return b.element - a.element;
            }
        );
      for(int i=0;i<arr.length;i++){
        pq.add(new Pair(arr[i] , Math.abs(x-arr[i])));
        if(pq.size()>k){
            pq.poll();
        }
      }
      while(!pq.isEmpty()){
        Pair P = pq.poll();
        list.add(P.element);
      }
      Collections.sort(list);
      return list;
    }
}
class Pair{
    int element;
    int diff;
    Pair(int element , int diff){
        this.element = element;
        this.diff = diff;
    }
}