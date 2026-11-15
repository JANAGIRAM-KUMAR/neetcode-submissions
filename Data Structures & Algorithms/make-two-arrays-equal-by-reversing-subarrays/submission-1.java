class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] count = new int[1001];
        for(int n : target) count[n]++;
        for(int n : arr) count[n]--;
        for(int n : count) if(n != 0) return false;
        return true;
    }
}
