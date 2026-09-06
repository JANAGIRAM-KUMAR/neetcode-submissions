class Solution {
    public String predictPartyVictory(String senate) {
        Deque<Integer> rq = new ArrayDeque<>();
        Deque<Integer> dq = new ArrayDeque<>();

        int sLen = senate.length();

        for(int i = 0; i < sLen; i++){
            if(senate.charAt(i) == 'R') rq.offer(i);
            else dq.offer(i);
        }

        while(!rq.isEmpty() && !dq.isEmpty()){
            int r = rq.poll();
            int d = dq.poll();

            if(r < d) rq.offer(r+sLen);
            else dq.offer(d+sLen);
        }

        return rq.isEmpty() ? "Dire" : "Radiant";

        
        
    }
}