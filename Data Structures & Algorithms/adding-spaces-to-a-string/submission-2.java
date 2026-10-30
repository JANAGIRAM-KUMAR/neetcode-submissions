class Solution {
    public String addSpaces(String s, int[] spaces) {
        int n = spaces.length;
        StringBuilder sb = new StringBuilder(s);
        int pos = 0;
        for(int space : spaces){   
            sb.insert(space + pos, " ");
            pos += 1;
        }

        return sb.toString();
    }
}


