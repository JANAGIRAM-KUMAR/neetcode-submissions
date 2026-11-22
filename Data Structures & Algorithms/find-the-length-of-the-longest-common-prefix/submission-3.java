class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int a : arr1){
            while(a > 0){
                String s = String.valueOf(a);
                int len = s.length();
                hm.put(a,len);
                a /= 10;
            }
        }
        int maxLen = 0;
        for(int a : arr2){
            while(a > 0){
                if(hm.containsKey(a)){
                    maxLen = Math.max(maxLen, hm.get(a));
                }
                a /= 10;
            }
        }

        return maxLen;
    }
}
