// Last updated: 14/07/2026, 13:59:26
class Solution {
    public int countEven(int num) {
        int count=0;
        for(int i=1;i<=num;i++){
            int n=i;
            int sum=0;
            while(n!=0){
                int t=n%10;
                sum+=t;
                n/=10;
            }
            if(sum%2==0){
                count++;
            }
        }
        return count;
    }
}