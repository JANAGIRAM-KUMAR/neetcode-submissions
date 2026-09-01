class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        Set<String> set = new HashSet();
        for(String d : dictionary){
            set.add(d);
        }
        int size = 0;
        int l = 0;
        for(int r = 0; r < s.length(); r++){
            String ss = s.substring(l,r);
            if(set.contains(ss)){
                size = r;
            }
        }

        return s.length() - size;
    }
}