class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>
        (
            (a,b) ->  b.distance - a.distance
        );
        for(int i=0;i<points.length;i++){
            int a = points[i][0];
            int b = points[i][1];
            int c = a*a + b*b;
            pq.add(new Pair(points[i] , c));
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[][] ans = new int[k][2];
        int i = 0;
        while(!pq.isEmpty()){
            Pair P = pq.poll();
            ans[i] = P.arr;
            i++;
        }
        return ans;
    }
}
class Pair{
    int[] arr;
    int distance;
    Pair(int[] arr , int distance){
        this.arr = arr;
        this.distance = distance;
    }
}