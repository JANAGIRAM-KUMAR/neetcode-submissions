class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        for(char c : s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(hm.entrySet());

        list.sort((e1,e2) -> e2.getValue().compareTo(e1.getValue()));

        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character, Integer> l : list){
            for(int i = 0; i < l.getValue(); i++){
                sb.append(l.getKey());
            }
        }

        return sb.toString();
    }
}