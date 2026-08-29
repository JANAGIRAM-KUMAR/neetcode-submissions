class Solution {
    int[] sides = new int[4];
    int totalSum = 0;
    int[] matchsticks;
    int sideLen;
    public boolean makesquare(int[] matchsticks) {    
        this.matchsticks = matchsticks;  
        for(int m : matchsticks){
            totalSum +=  m;
        }
        sideLen = totalSum / 4; 
        if(totalSum % 4 != 0) return false;
        return dfs(0);
         
    }
    public boolean dfs(int idx){
        if(idx == sideLen){
            return true;
        }
        for(int i = 0; i < 4; i++){
            if(sides[i] + matchsticks[idx] <= sideLen){
                sides[i] += sides[i] + matchsticks[idx];
                if(dfs(idx+1)) return true;
                sides[i] -= sides[i] + matchsticks[idx];
            }
        }
        return false;
    }
}