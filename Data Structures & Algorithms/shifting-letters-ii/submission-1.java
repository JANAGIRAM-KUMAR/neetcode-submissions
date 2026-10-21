class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        Map<Character, Character> fwMap = new HashMap<>();

        for(char c = 'a'; c <= 'z'; c++){
            char next = (c == 'z') ? 'a' : (char) (c+1);
            fwMap.put(c, next);
        }



        int[] diff = new int[n+1];

        for(int i = 0; i < shifts.length; i++){
            int st = shifts[i][0];
            int end = shifts[i][1];
            int dir = shifts[i][2];
            int val = 1;
            if(dir == 0) val = -1;
            diff[st] += val;
            diff[end+1] -= val;
        }

        int currShifts = 0;
        char[] letters = s.toCharArray();
        
        for(int i = 0; i < n; i++){
            currShifts += diff[i];
            
            int shift = currShifts % 26;
            if(shift < 0) shift += 26;

            char c = letters[i];
            for(int j = 0; j < shift; j++){
                c = fwMap.get(c);
            }
            letters[i] = c;
            
        }

        return new String(letters);
    }
}
