// Last updated: 19/08/2026, 12:17:11
1class Solution {
2    public boolean rotateString(String s, String goal) {
3                if(s.length()!=goal.length()) return false;
4                s+=s;
5                return s.contains(goal);
6    }
7}