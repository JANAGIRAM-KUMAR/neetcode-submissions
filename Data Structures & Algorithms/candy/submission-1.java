class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int count = 0;
        for(int i = 1; i < n; i++){
            if(ratings[i-1] > ratings[i]) count+=1;
            else if(ratings[i-1] == ratings[i]) continue;
        }
        for(int i = n-2; i >= 0; i--){
            if(ratings[i+1] > ratings[i]) count+=1;
            else if(ratings[i+1] == ratings[i]) continue;
        }

        return count+n;
    }
}