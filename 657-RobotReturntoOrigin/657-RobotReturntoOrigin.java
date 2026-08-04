// Last updated: 04/08/2026, 11:24:48
1class Solution {
2    public boolean judgeCircle(String moves) {
3
4        int x = 0;
5        int y = 0;
6
7        for (char c : moves.toCharArray()) {
8
9            if (c == 'L') x--;
10            else if (c == 'R') x++;
11            else if (c == 'U') y++;
12            else if (c == 'D') y--;
13        }
14
15        return x == 0 && y == 0;
16    }
17}