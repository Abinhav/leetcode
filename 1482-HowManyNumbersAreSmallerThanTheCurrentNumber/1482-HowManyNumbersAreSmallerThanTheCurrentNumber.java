// Last updated: 14/07/2026, 14:00:09
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
       
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(i!=j&&nums[j]<nums[i]){
                    c++;
                }
               
            }
            arr[i]=c;
            
        }
        return arr;
    }
}