class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        for(List<Integer> t : triangle){
            if(t.size() > 1){
                Collections.sort(t);
            }
        }
        int res = 0;
        for(List<Integer> t : triangle){
            res += t.get(0);
        }
        return res;
    }
}