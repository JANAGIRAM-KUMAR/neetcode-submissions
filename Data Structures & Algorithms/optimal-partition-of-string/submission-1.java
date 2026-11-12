class Solution {
    public int partitionString(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int count = 1;
        for(int i = 0; i < n; i++){
            if(set.contains(s.charAt(i))){
                set.clear();
                count++;
            }
            set.add(s.charAt(i));
        }

        return count;
    }
}