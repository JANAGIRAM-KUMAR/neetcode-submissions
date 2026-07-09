class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int[] s1hash = new int[26];
        int[] s2hash = new int[26];

        int s1len = s1.length();
        int s2len = s2.length();

        if (s1len > s2len) return false;

        int left = 0, right = 0;

        while (right < s1len) {
            s1hash[s1.charAt(right) - 'a']++;
            s2hash[s2.charAt(right) - 'a']++;
            right++;
        }

        right--;

        while (right < s2len) {

            if (arraysEqual(s1hash, s2hash)) {
                return true;
            }

            right++;
            if (right != s2len) {
                s2hash[s2.charAt(right) - 'a']++;
            }

            s2hash[s2.charAt(left) - 'a']--;
            left++;
        }

        return false;
    }

    private boolean arraysEqual(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}
