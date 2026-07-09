class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder("");
        boolean swapped = false;
        if(word1.length() > word2.length()){
            String temp = word1;
            word1 = word2;
            word2 = temp;
            swapped = true;
        }
        for(int i = 0; i < word1.length(); i++){
            if(!swapped){
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            } else {
                sb.append(word2.charAt(i));
                sb.append(word1.charAt(i));
            }
        }

        int su = word1.length();
        for(int i = su; i < word2.length(); i++){
            sb.append(word2.charAt(i));
        }
        return sb.toString();
    }
}