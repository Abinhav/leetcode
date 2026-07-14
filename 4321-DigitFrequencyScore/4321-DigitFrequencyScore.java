// Last updated: 14/07/2026, 13:58:52
class Solution {
    public int digitFrequencyScore(int n) {
        int a=n;
        int sum=0;
        while(a!=0){
            int temp=a%10;
            sum+=temp;
            a/=10;
        }
        return sum;
    }
}