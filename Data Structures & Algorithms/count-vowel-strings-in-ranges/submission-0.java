class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] count = new int[n];
        int x = 0;
        for(String w : words){
            if(isVowel(w)){
                count[x]++;
            }
            x++;
        }

        int[] prefix = new int[n];
        prefix[0] = count[0];
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i-1] + count[i];
        }

        int[] res = new int[queries.length];

        for(int i = 0; i < queries.length; i++){
            int li = queries[i][0];
            int ri = queries[i][1];

            if(li == 0) res[i] = prefix[ri];
            else res[i] = prefix[ri] - prefix[li-1];
        }

        return res;



    }

    public boolean isVowel(String s){
        s = s.toLowerCase();
        int n = s.length();
        if((s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u') && (s.charAt(n-1) == 'a' || s.charAt(n-1) == 'e' || s.charAt(n-1) == 'i' || s.charAt(n-1) == 'o' || s.charAt(n-1) == 'u')) return true;
        return false;
    }
}

// 1 0 1 1 1
// 1 1 2 3 4
