class Solution {
    public String largestGoodInteger(String num) {
        int n = num.length();
        String res = "";
        for(int r = 0; r < n-2; r++){
            if(num.charAt(r) == num.charAt(r+1) && 
            num.charAt(r+1) == num.charAt(r+2)){
                String curr = num.substring(r,r+3);
                if(curr.compareTo(res) > 0) res = curr;
            } 
        }

        return res;
        
    }
}