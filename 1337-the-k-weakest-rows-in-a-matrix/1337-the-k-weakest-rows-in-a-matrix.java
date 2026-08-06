class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>
        (
            (a,b) -> {
                if(b.freq!=a.freq){
                    return b.freq - a.freq;
                }
                return b.row - a.row;
            }
        );
       
        int row = mat.length;
        int col = mat[0].length;
        for(int i=0;i<row;i++){
            int count = 0;
            for(int j=0;j<col;j++){
                if(mat[i][j]==1){
                    count++;
                }      
            }
            pq.offer(new Pair(count , i));
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[] arr = new int[k];
        int x = k-1;
        while(!pq.isEmpty()){
            Pair P = pq.poll();
            arr[x] = P.row;
            x--;
        }
        return arr;
    }
}
class Pair{
    int freq;
    int row;
    Pair( int freq , int row){      
        this.freq = freq;
        this.row = row;
    }
}