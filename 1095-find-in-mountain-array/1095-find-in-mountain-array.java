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
        int left = 0;
        int right = mountainArr.length() - 1;
        while(left<right){
            int guess = left+(right-left)/2;
            if(mountainArr.get(guess)<mountainArr.get(guess+1)){
                left = guess+1;
            }
            else{
                right = guess;
            }
        }
        int peak = left;
        int low = 0;
        int high_1 = peak;
        while(low<=high_1){
            int mid = low+(high_1-low)/2;

            if(mountainArr.get(mid)==target){
                return mid;
            }
            else if(mountainArr.get(mid)<target){
                low = mid+1;
            }
            else{
                high_1 = mid-1;
            }
        }
        int low_2 = peak+1;
        int high = mountainArr.length()-1;
        while(low_2<=high){
            int mid = low_2+(high-low_2)/2;
            if(mountainArr.get(mid)==target){
                return mid;
            }
            else if(mountainArr.get(mid)>target){
                low_2 = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
}