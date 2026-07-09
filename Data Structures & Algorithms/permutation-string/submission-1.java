class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int s1len = s1.length();
        int s2len = s2.length();

        if (s1len > s2len) return false;

        Map<Character, Integer> s1map = new HashMap<>();
        Map<Character, Integer> s2map = new HashMap<>();

        int left = 0, right = 0;

        for (char c : s1.toCharArray()) {
            s1map.put(c, s1map.getOrDefault(c, 0) + 1);
        }

        while (right < s1len) {
            char c = s2.charAt(right);
            s2map.put(c, s2map.getOrDefault(c, 0) + 1);
            right++;
        }

        right--; 

        while (right < s2len) {

            if (s1map.equals(s2map)) {
                return true;
            }

            right++;

            if (right != s2len) {
                char addChar = s2.charAt(right);
                s2map.put(addChar, s2map.getOrDefault(addChar, 0) + 1);
            }

            char removeChar = s2.charAt(left);
            s2map.put(removeChar, s2map.get(removeChar) - 1);
            if (s2map.get(removeChar) == 0) {
                s2map.remove(removeChar);
            }

            left++;
        }

        return false;
    }
}
