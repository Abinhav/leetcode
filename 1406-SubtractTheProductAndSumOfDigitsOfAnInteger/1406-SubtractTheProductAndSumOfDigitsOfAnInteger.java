// Last updated: 14/07/2026, 14:00:13
class Solution {
    public int subtractProductAndSum(int n) {
        int dup=n;
        int sum=0;
        int pr=1;
        while(dup!=0){
            int temp=dup%10;
            sum+=temp;
            pr*=temp;
            dup/=10;

        }
        return pr-sum;
    }
}