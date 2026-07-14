// Last updated: 14/07/2026, 14:02:59
class Solution {
    public void sortColors(int[] nums) {
        int arr[]=Arrays.copyOf(nums,nums.length);
        for(int i=0;i<arr.length;i++){
            int c=0;
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    c++;
                }
            }
            if(c==0){
                break;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=arr[i]){
                nums[i]=arr[i];
            }
        }
    }
}