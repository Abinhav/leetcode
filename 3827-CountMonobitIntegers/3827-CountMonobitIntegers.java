// Last updated: 11/09/2026, 12:27:25
1class Solution {
2    public int countMonobit(int n) {
3        int c=0;
4        for(int i=0;i<=n;i++){
5            String s=Integer.toBinaryString(i);
6            if(check(s))c++;
7        }
8        return c;
9    }
10    public static boolean check(String s){
11        char c=s.charAt(0);
12        for(char x:s.toCharArray()){
13            if(x!=c)return false;
14        }
15        return true;
16    }
17}