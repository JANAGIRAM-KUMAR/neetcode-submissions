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

        int[] res = new int[queries.length];
        for(int i = 0; i < queries.length; i++){
            int li = queries[i][0];
            int ri = queries[i][1];
            int sum = 0;
            for(int j = li; j <= ri; j++){
                if(count[j] == 1) sum += 1;
            }
            res[i] = sum;
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
