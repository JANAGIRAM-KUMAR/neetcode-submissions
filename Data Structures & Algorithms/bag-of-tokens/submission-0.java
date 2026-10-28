class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int n = tokens.length;
        Arrays.sort(tokens);
        int maxScore = 0;
        int score = 0;
        int l = 0;
        int r = n-1;
        while(l <= r){
            if(power - tokens[l] >= 0){
                power -= tokens[l];
                score += 1;
                l++;
            } else if(score > 0){
                power += tokens[r];
                score -= 1;
                r--;
            } else break;
            maxScore = Math.max(score, maxScore);
        }

        return maxScore;
    }
}
