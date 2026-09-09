class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> set = new HashSet<>();
        int n = path.length();
        int x = 0, y = 0;
        String visited = x + "," + y;
        set.add(visited);
        for(int i = 0; i < n; i++){
            if(path.charAt(i) == 'N') y += 1;
            if(path.charAt(i) == 'S') y -= 1;
            if(path.charAt(i) == 'E') x += 1;
            if(path.charAt(i) == 'W') x -= 1;

            String curr = x + "," + y;

            if(set.contains(curr)) return true;
            set.add(curr);
        }
        return false;
    }
}