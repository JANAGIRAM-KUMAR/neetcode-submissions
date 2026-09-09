class Solution {
    public boolean isPathCrossing(String path) {
        int n = path.length();
        for(int i = 0; i < n-1; i++){
            if(path.charAt(i) == path.charAt(i+1)) return true;

            if(path.charAt(i) == 'E' && path.charAt(i+1) == 'W'
            || path.charAt(i) == 'W' && path.charAt(i+1) == 'E'
            || path.charAt(i) == 'N' && path.charAt(i+1) == 'S'
            || path.charAt(i) == 'S' && path.charAt(i+1) == 'N'
            ) return true;
        }
        return false;
    }
}