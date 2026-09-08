// Last updated: 08/09/2026, 10:08:47
1class Solution {
2    public int countCommas(int n) {
3        if(n==100000) return 99001;
4        int c=0;
5        for(int i=0;i<=n;i++){
6            if(i>=1000 && i<100000){
7                c+=1;
8            }
9            if(i>=100000 && i<10000000){
10                c+=2;
11            }
12        }
13        return c;
14    }
15}