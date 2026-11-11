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

        List<String> ls = new ArrayList<>();
        for(Map.Entry<String, Integer> e : hm.entrySet()){
            String key = e.getKey();
            int value = e.getValue();
            if(value == 1) ls.add(key);
        }

        String[] res = new String[ls.size()];
        int i = 0;
        for(String s : ls){
            res[i++] = s;
        }

        return res;
    }
}


