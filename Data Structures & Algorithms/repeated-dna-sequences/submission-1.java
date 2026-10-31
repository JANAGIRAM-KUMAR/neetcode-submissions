class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        String sb = "";
        List<String> res = new ArrayList<>();
        Map<String, Integer> hm = new HashMap<>();
        int l = 0;
        for(int r = 0; r < s.length(); r++){
            sb += s.charAt(r);
            if(r-l+1 == 10){
                hm.put(sb, hm.getOrDefault(sb,0)+1);
                sb = sb.substring(1);
                l++;
            }
        }
        for(Map.Entry<String, Integer> entry : hm.entrySet()){
            String key = entry.getKey();
            int val = entry.getValue();
            if(val >= 2){
                res.add(key);
            }
        }
        return res;
    }
}
