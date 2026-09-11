class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int[] res = new int[n];
        int[] bucket = new int[1001];
        for(int num : arr1){
            bucket[num]++;
        }

        int index = 0;

        for(int num : arr2){
            while(bucket[num] > 0){
                res[index++] = num;
                bucket[num]--;
            }
        }

        for(int i = 0; i < 1001; i++){
            while(bucket[i] > 0){
                res[index++] = i;
                bucket[i]--;
            }
        }

        return res;
    }
}