// Last updated: 24/08/2026, 11:12:54
1class Solution {
2    public int longestConsecutive(int[] nums) {
3
4        HashSet<Integer> set = new HashSet<>();
5
6        for(int num : nums) {
7            set.add(num);
8        }
9
10        int longest = 0;
11
12        for(int num : set) {
13
14            if(!set.contains(num - 1)) {
15
16                int current = num;
17                int streak = 1;
18
19                while(set.contains(current + 1)) {
20                    current++;
21                    streak++;
22                }
23
24                longest = Math.max(longest, streak);
25            }
26        }
27
28        return longest;
29    }
30}