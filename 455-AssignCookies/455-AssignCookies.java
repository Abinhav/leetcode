// Last updated: 12/09/2026, 10:27:59
1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3        Arrays.sort(g);
4        Arrays.sort(s);
5        int l=0,r=0;
6        while(l<s.length && r<g.length){
7            if(g[r]<=s[l]){
8                r++;
9            }
10            l++;
11        }
12        return r;
13    }
14}