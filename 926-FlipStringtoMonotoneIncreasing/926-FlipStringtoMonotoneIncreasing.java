// Last updated: 04/08/2026, 12:41:44
1class Solution {
2    public int minFlipsMonoIncr(String s) {
3         int f0 = 0, f1 = 0;
4         for (int i = 0; i < s.length(); ++i) {
5         f0 += s.charAt(i) - '0';
6         f1 = Math.min(f0, f1 + 1-(s.charAt(i)-'0'));
7  }
8  return f1;
9    }
10}