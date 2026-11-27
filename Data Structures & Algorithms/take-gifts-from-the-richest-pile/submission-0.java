class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        for(int g : gifts) pq.add(g);

        long res = 0;
        while(k > 0){
            int curr = pq.poll();
            int sqrt = (int) Math.sqrt(curr);
            pq.offer(sqrt);
            k--;
        }

        for(int g : pq) res += g;

        return res;
    }

    
}