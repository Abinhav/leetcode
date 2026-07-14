// Last updated: 14/07/2026, 14:01:47
class Solution {
    public boolean isPerfectSquare(int num) {

        long l = 1;
        long h = num;

        while(l <= h){

            long mid = l + (h - l) / 2;

            if(mid == num / mid && num % mid == 0){
                return true;
            }
            else if(mid > num / mid){
                h = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }

        return false;
    }
}