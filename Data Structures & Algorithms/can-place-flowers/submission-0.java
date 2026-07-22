class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int[] f = new int[flowerbed.length + 2];
        int i = 1;
        for(int fl : flowerbed) f[i+1] = fl;
        for(i = 1; i < f.length - 1; i++){
            if(f[i-1] == 0 && f[i] == 0 && f[i+1] == 0){
                f[i] = 1;
                n--;
            }
        }
        return n<=0;
    }
}