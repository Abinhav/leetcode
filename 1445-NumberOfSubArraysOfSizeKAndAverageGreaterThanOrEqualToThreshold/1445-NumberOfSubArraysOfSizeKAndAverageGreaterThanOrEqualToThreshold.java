// Last updated: 14/07/2026, 14:00:10
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int c=0;
        int max=sum/k;
        if(max>=threshold){
            c++;
        }
        int l=0;
        
        for(int r=k;r<arr.length;r++){
            int avg=0;
            sum+=arr[r];
            sum-=arr[l];
            avg=sum/k;
            if(avg>=threshold){
                c++;
            }
            l++;
        }
        return c;
    }
}