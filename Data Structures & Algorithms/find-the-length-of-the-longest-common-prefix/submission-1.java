class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int maxLen = Integer.MIN_VALUE;
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                String s1 = String.valueOf(arr1[i]);
                String s2 = String.valueOf(arr2[j]);
                int len = s1.length() <= s2.length() ? s1.length() : s2.length();
                int ctr = 0;
                while(ctr < len){
                    if(s1.charAt(ctr) == s2.charAt(ctr)) ctr++;
                    else break;
                }
                maxLen = Math.max(maxLen, ctr);
            }
        }

        return maxLen;
    }
}
