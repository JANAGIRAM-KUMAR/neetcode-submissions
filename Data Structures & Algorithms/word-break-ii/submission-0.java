class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        Map<Integer, List<String>> memo = new HashMap<>();


        return dfs(0,s,set,memo);
    }

    public List<String> dfs(
        int st, 
        String s, 
        Set<String> set, 
        Map<Integer, List<String>> memo) {
            if(memo.containsKey(st)){
                return memo.get(st);
            }

            List<String> res = new ArrayList<>();
            if(st == s.length()){
                res.add("");
                return res;
            }

            for(int end = st+1; end <=s.length(); end++){
                String word = s.substring(st,end);
                if(set.contains(word)){
                    List<String> suffixes = dfs(end,s,set,memo);
                    for(String suffix : suffixes){
                        if(suffix.isEmpty()) res.add(word);
                        else res.add(word + " " + suffix);
                    }
                }
            }
            memo.put(st,res);
            return res;
        }
}