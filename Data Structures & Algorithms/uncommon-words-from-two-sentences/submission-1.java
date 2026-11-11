class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> hm = new HashMap<>();
        String[] w1 = s1.split(" ");
        String[] w2 = s2.split(" ");

        for(String w : w1){
            hm.put(w, hm.getOrDefault(w,0)+1);
        }
        for(String w : w2){
            hm.put(w, hm.getOrDefault(w,0)+1);
        }

        List<String> res = new ArrayList<>();
        for(Map.Entry<String, Integer> e : hm.entrySet()){
            String key = e.getKey();
            int value = e.getValue();
            if(value == 1) res.add(key);
        }

        
        return res.toArray(new String[0]);
    }
}


