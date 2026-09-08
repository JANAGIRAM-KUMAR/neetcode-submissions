class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> hm = new TreeMap<>();
        int n = names.length;
        for(int i = 0; i < n; i++){
            hm.put(heights[i], names[i]);
        }

        int idx = 0;
        List<String> res = new ArrayList<>(hm.values());
        for(int i = n - 1; i >= 0; i--){
            names[idx++] = res.get(i);
        }
        return names;
    }
}