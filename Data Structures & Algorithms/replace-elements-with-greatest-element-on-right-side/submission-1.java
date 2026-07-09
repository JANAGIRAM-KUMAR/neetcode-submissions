class Solution {
    int[] arr;
    public int[] replaceElements(int[] arr) {
        this.arr = arr;
        int n = arr.length;
        int[] res = new int[n];
        int rightMax = -1;
        for(int i = n - 1; i >= 0; i--){ 
            res[i] = rightMax;
            rightMax = Math.max(rightMax,arr[i]);   
        }
        return res;
    }
}