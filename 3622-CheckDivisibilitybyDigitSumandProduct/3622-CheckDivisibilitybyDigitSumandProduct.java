// Last updated: 22/08/2026, 18:46:57
1class Solution {
2    public boolean checkDivisibility(int n) {
3        int a=n;
4        int sum=0;
5        int p=1;
6        while(a!=0){
7            int temp=a%10;
8            sum+=temp;
9            p*=temp;
10            a/=10;
11        }
12        int t=sum+p;
13        return n%t==0;
14    }
15}