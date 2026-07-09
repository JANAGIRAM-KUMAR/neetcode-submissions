class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        int targetX = target[0];
        int targetY = target[1];
        int targetZ = target[2];

        int maxX = 0, maxY = 0, maxZ = 0;
        for(int[] tri : triplets){
            if(tri[0] <= targetX && tri[1] <= targetY && tri[2] <= targetZ){
                maxX = Math.max(maxX, tri[0]);
                maxY = Math.max(maxY, tri[1]);
                maxZ = Math.max(maxZ, tri[2]);
            }
        }
        return targetX == maxX && targetY == maxY && targetZ == maxZ;
    }
}
