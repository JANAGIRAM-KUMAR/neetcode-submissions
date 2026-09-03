class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int[] ps1 = new int[n]; 
        int[] ps2 = new int[n];

        ps1[0] = s.charAt(0) == '0' ? 1 : 0;
        ps2[n-1] = s.charAt(n-1) == '1'? 1 : 0;

        for(int i = 1; i <= n-1; i++){
            if(s.charAt(i) == '0'){
                ps1[i] = ps1[i-1] + 1;
            } else {
                ps1[i] = ps1[i-1];
            }
        }

        for(int i = n-2; i >= 0; i--){
            if(s.charAt(i) == '1'){
                ps2[i] = ps2[i+1] + 1;
            } else {
                ps2[i] = ps2[i+1];
            }
        }

        int[] maxSum = new int[n];
        int i = 0, j = 1;
        int idx = 0;
        while(i < n-1){
            maxSum[idx++] = ps1[i] + ps2[j];
            i++;
            j++;
        }

        int max = 0;
        for(int m : maxSum){
            max = Math.max(max,m);
        }
        
        return max;

        
    }
}