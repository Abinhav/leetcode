// Last updated: 31/08/2026, 16:25:29
1class Solution {
2    public String toHex(int num) {
3
4        if (num == 0) {
5            return "0";
6        }
7
8        char[] hex = "0123456789abcdef".toCharArray();
9        String ans = "";
10
11        for (int i = 0; i < 8; i++) {
12
13            int rem = num & 15;
14
15            ans = hex[rem] + ans;
16
17            num = num >>> 4;
18
19            if (num == 0) {
20                break;
21            }
22        }
23
24        return ans;
25    }
26}