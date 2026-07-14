// Last updated: 14/07/2026, 13:59:54
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        int mlen=0;
        for(int i=0;i<arr.length;i++){
            int temp=0;
            for(int j=i;j<arr.length;j++){
                temp+=arr[j];
                mlen=j-i+1;
                if(mlen%2!=0){
                 sum+=temp;
                }
            }
        }
        return sum;
    }
}