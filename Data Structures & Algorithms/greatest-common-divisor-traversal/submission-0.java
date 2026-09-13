
class Solution {
    public boolean canTraverseAllPairs(int[] nums) {
        int n = nums.length;
        
        // Edge case: A single element is always connected to itself
        if (n == 1) {
            return true;
        }

        // Step 1: Create your 2D True/False matrix (Adjacency Matrix)
        boolean[][] matrix = new boolean[n][n];

        // Step 2: Compare every pair i and j exactly as you planned
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // If they share a common factor greater than 1
                if (gcd(nums[i], nums[j]) > 1) {
                    matrix[i][j] = true;
                    matrix[j][i] = true; // The connection goes both ways
                }
            }
        }

        // Step 3: Create your 1D Matrix (Initialized to 0)
        int[] oneDMatrix = new int[n];

        // Step 4: Resolve the island issue by traversing from index 0
        // This systematically flips 0 to 1 only for indices reachable from the start
        traverseGraph(0, matrix, oneDMatrix);

        // Step 5: Check if every single index became a 1
        for (int state : oneDMatrix) {
            if (state == 0) {
                return false; // An island exists that index 0 cannot reach!
            }
        }

        return true; 
    }

    // Traversal function to find entire connected groups using your matrices
    private void traverseGraph(int currentIndex, boolean[][] matrix, int[] oneDMatrix) {
        // Mark the current index as visited in your 1D matrix
        oneDMatrix[currentIndex] = 1;

        // Check row 'currentIndex' in your 2D matrix for connected partners
        for (int neighbor = 0; neighbor < matrix.length; neighbor++) {
            // If they are paired true AND we haven't visited this neighbor yet
            if (matrix[currentIndex][neighbor] && oneDMatrix[neighbor] == 0) {
                // Recursively jump to the partner index
                traverseGraph(neighbor, matrix, oneDMatrix);
            }
        }
    }

    // Helper function to find the Greatest Common Divisor
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
