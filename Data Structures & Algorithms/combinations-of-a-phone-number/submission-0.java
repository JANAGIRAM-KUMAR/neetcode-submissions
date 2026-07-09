class Solution {
    String[] letters = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    List<String> res = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return res;
        backtrack(0,"",digits);
        return res;
    }
    public void backtrack(int i,String curr,String digits){
        if(curr.length() == digits.length()){
            res.add(curr);
            return;
        }
        String chars = letters[digits.charAt(i) - '0'];
        for(char c : chars.toCharArray()){
            backtrack(i+1,curr + c,digits);
        }
    }
}
