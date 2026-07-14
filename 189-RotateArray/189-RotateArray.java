// Last updated: 14/07/2026, 14:02:30
class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int rot[]=new int[n];
        k=k%n;
        for(int i=0;i<n;i++){
             rot[(i+k)%n]=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=rot[i];
        }
    }
}