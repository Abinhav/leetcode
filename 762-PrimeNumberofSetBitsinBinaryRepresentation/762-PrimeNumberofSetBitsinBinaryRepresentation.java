// Last updated: 05/09/2026, 10:23:58
1class Solution {
2    public int countPrimeSetBits(int left, int right) {
3       int c=0;
4       for(int i=left;i<=right;i++) {
5        int n=Integer.bitCount(i);
6        if(check(n))c++;
7       }
8       return c;
9    }
10    public static boolean check(int n){
11        if(n<=1) return false;
12        int c=0;
13        for(int i=1;i<=n;i++){
14            if(n%i==0){
15                c++;
16            }
17        }
18        return c==2;
19    }
20}