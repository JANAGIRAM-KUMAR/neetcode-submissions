class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        StringBuilder sb = new StringBuilder();
        List<String> res = new ArrayList<>();
        Map<String, Integer> hm = new HashMap<>();
        int l = 0;
        for(int r = 0; r < s.length(); r++){
            sb.append(s.charAt(r));
            if(r-l+1 == 10){
                String str = sb.toString();
                hm.put(str, hm.getOrDefault(str,0)+1);
                sb.deleteCharAt(0);
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
