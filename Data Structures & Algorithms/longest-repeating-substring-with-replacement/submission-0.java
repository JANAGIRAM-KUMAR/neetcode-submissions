class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> count = new HashMap<>();
        int window_start = 0;
        int max_count = 0;
        int res = 0;
        for(int window_end = 0; window_end < s.length(); window_end++){
            count.put(s.charAt(window_end), count.getOrDefault(s.charAt(window_end),0)+1);
            max_count = Math.max(max_count, count.get(s.charAt(window_end)));

            while(window_end - window_start - max_count + 1 > k){
                count.put(s.charAt(window_start), count.getOrDefault(s.charAt(window_start),0)-1);
                window_start ++;
            }

            res = Math.max(res, window_end - window_start + 1);
        }
        return res;
    }
}
