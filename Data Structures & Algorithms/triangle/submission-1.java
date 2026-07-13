class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        for(int r = n-2; r >= 0; r--){
            for(int c = 0; c <= r; c++){
                triangle.get(r).set(c, triangle.get(r).get(c) + Math.min(triangle.get(r+1).get(c), triangle.get(r+1).get(c+1)));
            }
        }
        return triangle.get(0).get(0);

    }
}