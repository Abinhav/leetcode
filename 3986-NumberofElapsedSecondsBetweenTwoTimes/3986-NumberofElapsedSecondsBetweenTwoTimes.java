// Last updated: 11/09/2026, 11:32:38
1class Solution {
2    public int secondsBetweenTimes(String s, String e) {
3        String a[]=s.split(":");
4        String b[]=e.split(":");
5        int t1=Integer.parseInt(a[0])*3600 + Integer.parseInt(a[1])*60+Integer.parseInt(a[2]);
6        int t2=Integer.parseInt(b[0])*3600+Integer.parseInt(b[1])*60+Integer.parseInt(b[2]);
7        return t2-t1;
8    }
9}