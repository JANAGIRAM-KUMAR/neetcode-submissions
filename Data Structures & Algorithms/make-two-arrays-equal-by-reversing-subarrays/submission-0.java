class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        int idx = 0;
        for(int i = n-1; i >= 0; i--) res[idx++] = arr[i];

        return Arrays.equals(target, res);
    }
}
