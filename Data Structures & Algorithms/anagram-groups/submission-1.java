class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hm = new HashMap<>();
        for(String s: strs){
            int[] count = new int[26];
            for(char c : s.toCharArray()){
                count[c - 'a']++;
            }
            String ch = Arrays.toString(count);
            hm.putIfAbsent(ch, new ArrayList<>());
            hm.get(ch).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}
