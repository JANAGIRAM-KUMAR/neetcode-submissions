class Solution {
    public long dividePlayers(int[] skill) {
        int n = skill.length;
        int total = 0;
        for(int s : skill) total += s;
        int teamScore = total / (n/2);

        Arrays.sort(skill);
        int l = 0, r = n-1;

        long teamChemistry = 0;

        while(l<r){
            if(skill[l] + skill[r] == teamScore){
                teamChemistry += (skill[l] * skill[r]);
                l++;
                r--;
            } else {
                return -1;
            }
        }

        return teamChemistry;



        



    }
}
