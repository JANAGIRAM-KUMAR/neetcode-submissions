class Solution {
    public boolean canTraverseAllPairs(int[] nums) {
        int n = nums.length;
        if (n == 1) return true;

        boolean[][] matrix = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (gcd(nums[i], nums[j]) > 1) {
                    matrix[i][j] = true;
                    matrix[j][i] = true; 
                }
            }
        }

        int[] adj = new int[n];

        traverseGraph(0, matrix, adj);

        for (int state : adj) {
            if (state == 0) {
                return false;
            }
        }

        return true; 
    }

    private void traverseGraph(int curr, boolean[][] matrix, int[] adj) {
        adj[curr] = 1;

        for (int nei = 0; nei < matrix.length; nei++) {
            if (matrix[curr][nei] && adj[nei] == 0) {
                traverseGraph(nei, matrix, adj);
            }
        }
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
