class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i-1] ^ arr[i];
        }

        int[] res = new int[queries.length];
        for(int i = 0; i < queries.length; i++){
            int st = queries[i][0];
            int end = queries[i][1];
            if(st == end) res[i] = arr[st];
            else res[i] = res[i] = prefix[end-st];
        }

        return res;
    }
}


