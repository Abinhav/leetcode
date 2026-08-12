// Last updated: 12/08/2026, 14:44:33
1class Solution {
2    public int sumOddLengthSubarrays(int[] arr) {
3        int sum=0;
4        int mlen=0;
5        for(int i=0;i<arr.length;i++){
6            int temp=0;
7            for(int j=i;j<arr.length;j++){
8                temp+=arr[j];
9                mlen=j-i+1;
10                if(mlen%2!=0){
11                 sum+=temp;
12                }
13            }
14        }
15        return sum;
16    }
17}