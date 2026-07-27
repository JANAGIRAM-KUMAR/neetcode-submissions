class Solution {
    public int minimumRecolors(String blocks, int k) {
        int whites = 0;
        int idx = 0;
        for(int i = 0; i < k; i++){
            if (blocks.charAt(i) == 'W') {
                whites++;
            }
        }

        int minCol = whites;

        for(int i = k; i < blocks.length(); i++){
            if(blocks.charAt(i) == 'W') whites++;
            if(blocks.charAt(i - k) == 'W') whites--;

            minCol = Math.min(minCol, whites);
        }
        return minCol;
        
    }
}