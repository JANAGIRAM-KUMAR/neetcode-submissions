class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hm = new HashMap<>();
        for(String s: strs){
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String ch = new String(ca);
            hm.putIfAbsent(ch, new ArrayList<>());
            hm.get(ch).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}
