// Last updated: 14/07/2026, 13:58:56
class Solution {
    public boolean checkDivisibility(int n) {
        int a=n;
        int sum=0;
        int p=1;
        while(a!=0){
            int temp=a%10;
            sum+=temp;
            p*=temp;
            a/=10;
        }
        int t=sum+p;
        return n%t==0;
    }
}