class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int n = arr.length;
        if(n == 1) return 1;
        int l = 0;
        int maxSize = 0;
        for(int r = 1; r < n; r++){
            if(arr[r] == arr[r-1]) l = r;
            if(r > 1 && ((arr[r-2] > arr[r-1] && arr[r-1] > arr[r] ||
            arr[r-2] < arr[r-1] && arr[r-1] < arr[r]))) l = r-1;
            maxSize = Math.max(maxSize, r-l+1);
        }
        return maxSize;
    }
}