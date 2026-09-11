// Last updated: 11/09/2026, 10:21:30
1class Solution {
2    public boolean checkGoodInteger(int n) {
3        return ss(n)-ds(n)>=50;
4    }
5    public static int ds(int n){
6        int s=0;
7        while(n!=0){
8            int t=n%10;
9            s+=t;
10            n/=10;
11        }
12        return s;
13    }
14    public static int ss(int n){
15        int s=0;
16        while(n>0){
17            int t=n%10;
18            s+=(t*t);
19            n/=10;
20        }
21        return s;
22    }
23}