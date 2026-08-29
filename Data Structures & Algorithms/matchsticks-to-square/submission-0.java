class Solution {
    int[] sides = {0,0,0,0};
    int totalSum = 0;
    int sideLen = totalSum / 4; 
    int[] matchsticks;
    public boolean makesquare(int[] matchsticks) {    
        this.matchsticks = matchsticks;  
        for(int m : matchsticks){
            totalSum +=  m;
        }
        if(totalSum % 4 != 0) return false;
        return dfs(0);
         
    }
    public boolean dfs(int idx){
        if(sides[idx] == sideLen){
            return true;
        }
        for(int i = 0; i < 4; i++){
            if(sides[i] <= sides[i] + matchsticks[idx]){
                sides[i] += sides[i] + matchsticks[idx];
                if(dfs(idx+1)) return true;
                sides[i] -= sides[i] + matchsticks[idx];
            }
        }
        return false;
    }
}