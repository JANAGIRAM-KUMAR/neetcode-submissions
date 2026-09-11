class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] res = new int[n];
        int balls = 0, operations = 0;
        for(int i = 0; i < n; i++){
            res[i] += operations;
            if(boxes.charAt(i) == '1') balls += 1;
            operations += balls;
        }

        balls = 0;
        operations = 0;

        for(int i = n-1; i >= 0; i--){
            res[i] += operations;
            if(boxes.charAt(i) == '1') balls += 1;
            operations += balls;
        }

        return res;
    }
}