class Solution {
    public int scheduleCourse(int[][] courses) {

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> {
                if (a.lastDay != b.lastDay) {
                    return a.lastDay - b.lastDay;
                }
                return a.totalDuration - b.totalDuration;
            }
        );
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < courses.length; i++) {
            pq.add(new Pair(courses[i][1], courses[i][0]));
        }
        int td = 0;
        while (!pq.isEmpty()) {
            Pair P = pq.poll();
            pq2.add(P.totalDuration);
            td += P.totalDuration;
            int ld = P.lastDay;
            if (td > ld) {
                td = td - pq2.poll();
            } 
        }
        return pq2.size();
    }
}
class Pair {
    int lastDay;
    int totalDuration;
    Pair(int lastDay, int totalDuration) {
        this.lastDay = lastDay;
        this.totalDuration = totalDuration;
    }
}