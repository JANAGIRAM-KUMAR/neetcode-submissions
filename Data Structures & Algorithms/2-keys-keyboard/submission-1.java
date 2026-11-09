class Solution {
    public int minSteps(int n) {
        int steps = 0;
        for(int i = 2; i*i <= n; i++){
            while(n % i == 0){
                n /= i;
                steps += i;
            }
        }

        if(n > 1) steps += n;

        return steps;
    }
}




