// Last updated: 14/07/2026, 14:00:29
class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int total=0;
        for(int i=0;i<arr.length;i++){
            total+=arr[i];
        }
        if(total%3!=0){
            return false;
        }
        int tar=total/3;
        int count=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==tar){
                sum=0;
                count++;
            }
        }
        return count>=3;
    }
}