// Last updated: 15/07/2026, 15:24:15
1class Solution {
2    public int timeRequiredToBuy(int[] tickets, int k) {
3
4        int time = 0;
5
6        for (int i = 0; i < tickets.length; i++) {
7
8            if (i <= k) {
9                time += Math.min(tickets[i], tickets[k]);
10            } else {
11                time += Math.min(tickets[i], tickets[k] - 1);
12            }
13
14        }
15
16        return time;
17    }
18}