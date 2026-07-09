class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        if(n % groupSize != 0) return false;

        HashMap<Integer,Integer> cardCounts = new HashMap<>();
        for(int c : hand){
            cardCounts.put(c,cardCounts.getOrDefault(c,0)+1);
        }
        Arrays.sort(hand);
        for(int c : hand){
            if(cardCounts.get(c) == 0) continue;
            for(int i = 0; i < groupSize; i++){
                int next = c + i;
                if(cardCounts.getOrDefault(next,0) <= 0) return false;
                cardCounts.put(next, cardCounts.get(next) - 1);
            }
        }
        return true;
    }
}
