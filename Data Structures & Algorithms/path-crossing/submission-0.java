class Solution {
    public boolean isPathCrossing(String path) {
        int n = path.length();
        for(int i = 0; i < n-1; i++){
            if(path.charAt(i) == path.charAt(i+1)) return true;
        }
        return false;
    }
}