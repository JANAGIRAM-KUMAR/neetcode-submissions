class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character, Integer> lastIndex = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!lastIndex.containsKey(c)){
                lastIndex.put(c, s.lastIndexOf(c));
            }
        }
        List<Integer> res = new ArrayList<>();
        int mx = 0, j = 0;
        for(int i = 0; i < s.length(); i++){
            mx = Math.max(mx,lastIndex.get(s.charAt(i)));
            if(i == mx){
                res.add(i - j + 1);
                j = i + 1;
            }
        }
        return res;
    }
}
