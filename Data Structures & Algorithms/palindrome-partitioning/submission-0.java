class Solution {
    List<List<String>> res = new ArrayList<>();
    public List<List<String>> partition(String s) {
        backtrack(0,s,new ArrayList<>());
        return res;
    }
    public void backtrack(int index ,String s, List<String> path){
        if(index == s.length()){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = index; i < s.length();i++){
            if(isPalindrome(s,index,i)){
                path.add(s.substring(index,i+1));
                backtrack(i+1,s,path);
                path.remove(path.size() - 1);
            }
        }

    }
    public boolean isPalindrome(String s, int l, int r){
        while(l < r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
