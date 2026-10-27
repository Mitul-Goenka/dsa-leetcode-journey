class Solution {
    public int minimumEffortPath(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;
        List<List<Integer>> res = new ArrayList<>();        
        for(int i=0;i<n;i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<m;j++){
            row.add(Integer.MAX_VALUE);
            }
            res.add(new ArrayList<>(row));
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a , b) -> {
                if(a.first != b.first){
                    return Integer.compare(a.first , b.first);
                }
                return Integer.compare(a.second.first , b.second.first);
            }
        );
        int[] x = {-1,1,0,0};
        int[] y = {0,0,1,-1};
        res.get(0).set(0,0);
        pq.add(new Pair(0 , new Coordinates(0,0)));
        while(!pq.isEmpty()){
            Pair p = pq.poll();
            int dis = p.first;
            int row = p.second.first;
            int col = p.second.second;
            if(dis>res.get(row).get(col)){
                continue;
            }
            for(int k=0;k<4;k++){
                int r = row+x[k];
                int c = col+y[k];
                if(!isValid(r , c , n , m)){
                    continue;
                }
                int absdiff = Math.abs(heights[row][col] - heights[r][c]);
                int newwt = Math.max(absdiff , dis);
                if(newwt<res.get(r).get(c)){
                    res.get(r).set(c,newwt);
                    pq.add(new Pair(newwt , new Coordinates(r , c)));
                }
            }
        }
       return res.get(n-1).get(m-1);
    }
    boolean isValid(int i , int j , int n , int m){
        if(i<0 || i>=n || j<0 || j>=m){
            return false;
        }
        return true;
    }
    class Pair{
        int first;
        Coordinates second;
        Pair(int first , Coordinates second){
            this.first = first;
            this.second = second;
        }
    }
    class Coordinates{
        int first;
        int second;
        Coordinates(int first , int second){
            this.first = first;
            this.second = second;
        }
    }
}