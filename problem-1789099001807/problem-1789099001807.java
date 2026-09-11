// Last updated: 11/09/2026, 09:26:41
1class Solution {
2    public boolean isAdjacentDiffAtMostTwo(String s) {
3        for(int i=0;i<s.length()-1;i++){
4            int a=s.charAt(i)-'0';
5            int b=s.charAt(i+1)-'0';
6            if(Math.abs(a-b)>2) return false;
7        }
8        return true;
9    }
10}