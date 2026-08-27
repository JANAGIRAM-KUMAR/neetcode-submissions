class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        if(wall.size() == 0) return 0;
        if(wall.size() == 1) return 1;
        Map<Integer, Integer> count = new HashMap<>();
        for(List<Integer> w : wall){
            int total = 0;
            for(int i = 0; i < w.size()-1; i++){
                total += w.get(i);
                count.put(total, count.getOrDefault(total,0)+1);
            }
        }

        int gap = 0;
        for(int c : count.values()){
            gap = Math.max(gap,c);
        }

        return wall.size() - gap;

    }
}