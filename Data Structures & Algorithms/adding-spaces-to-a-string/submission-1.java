class Solution {
    public String addSpaces(String s, int[] spaces) {
        int n = spaces.length;
        for(int i = n-1; i >= 0; i--){
            spaces[i] += i;
        }

        StringBuilder sb = new StringBuilder(s);
        for(int space : spaces){
            sb.insert(space, " ");
        }

        return sb.toString();
    }
}


