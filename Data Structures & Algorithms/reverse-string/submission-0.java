class Solution {
    public void reverseString(char[] s) {
        
        int n = s.length;
        char[] cp = new char[n];

        for(int i = 0; i < n; i++){
            cp[i] = s[i];
        }
        int idx = 0;
        for(int i = n - 1; i >= 0; i--){
            s[idx++] = cp[i];
        }
    }
}