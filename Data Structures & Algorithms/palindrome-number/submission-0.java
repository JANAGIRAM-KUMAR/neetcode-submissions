class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int copy = x;
        int palindrome = 0;
        while(copy != 0){
            int digit = copy%10;
            palindrome = palindrome * 10 + digit;
            copy /= 10;
        }
        if(palindrome == x) return true;
        return false;
    }

}