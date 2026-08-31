// Last updated: 31/08/2026, 14:48:07
1import java.util.*;
2
3class Solution {
4    public List<String> summaryRanges(int[] nums) {
5
6        List<String> ans = new ArrayList<>();
7
8        int i = 0;
9
10        while (i < nums.length) {
11
12            int start = nums[i];
13
14            while (i + 1 < nums.length &&
15                   nums[i + 1] == nums[i] + 1) {
16                i++;
17            }
18
19            int end = nums[i];
20
21            if (start == end) {
22                ans.add(String.valueOf(start));
23            } else {
24                ans.add(start + "->" + end);
25            }
26
27            i++;
28        }
29
30        return ans;
31    }
32}