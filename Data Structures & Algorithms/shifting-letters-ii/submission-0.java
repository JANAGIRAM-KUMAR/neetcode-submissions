class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        Map<Character, Character> fwMap = new HashMap<>();
        Map<Character, Character> revMap = new HashMap<>();

        for(char c = 'a'; c <= 'z'; c++){
            char next = (c == 'z') ? 'a' : (char) (c+1);
            char prev = (c == 'a') ? 'z' : (char) (c-1);
            fwMap.put(c, next);
            revMap.put(c, prev);
        }

        char[] letters = s.toCharArray();

        for(int i = 0; i < shifts.length; i++){
            int st = shifts[i][0];
            int end = shifts[i][1];
            int direction = shifts[i][2];

            

            for(int j = st; j <= end; j++){
                if(direction == 1){
                    letters[j] = fwMap.get(letters[j]);
                } else {
                    letters[j] = revMap.get(letters[j]);
                }
            }

        }

        return new String(letters);
    }
}
