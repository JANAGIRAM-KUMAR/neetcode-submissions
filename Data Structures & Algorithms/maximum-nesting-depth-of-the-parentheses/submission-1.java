public class Solution {
    public int maxDepth(String s) {
        int res = 0, cur = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                cur++;
            } else if (c == ')') {
                cur--;
            }
            res = Math.max(res, cur);
        }

        return res;
    }
}