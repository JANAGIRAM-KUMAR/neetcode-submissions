/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int len = mountainArr.length();
        int peak = findPeak(mountainArr,0,len-1);
        int left = findLeft(target, mountainArr, 0 , peak);
        if(left != -1){
            return left;
        }

        return findRight(target, mountainArr,peak + 1, len - 1);
    }

    public int findPeak(MountainArray mountainArr, int low, int high){
        while(low < high){
            int mid = low + (high - low)/2;
            if(mountainArr.get(mid) < mountainArr.get(mid+1)){
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public int findLeft(int target, MountainArray mountainArr, int low, int high){
        while(low <= high){
            int mid = low + (high - low)/2;
            if(mountainArr.get(mid) == target){
                return mid;
            } else if (mountainArr.get(mid) > target){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public int findRight(int target, MountainArray mountainArr, int low, int high){
        while(low <= high){
            int mid = low + (high - low)/2;
            if(mountainArr.get(mid) == target){
                return mid;
            } else if (mountainArr.get(mid) < target){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}