// Last updated: 17/08/2026, 17:22:15
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> threeSum(int[] nums) {
5
6        List<List<Integer>> result = new ArrayList<>();
7
8        Arrays.sort(nums);
9
10        for (int i = 0; i < nums.length - 2; i++) {
11
12            // Skip duplicate first elements
13            if (i > 0 && nums[i] == nums[i - 1]) {
14                continue;
15            }
16
17            int left = i + 1;
18            int right = nums.length - 1;
19
20            while (left < right) {
21
22                int sum = nums[i] + nums[left] + nums[right];
23
24                if (sum == 0) {
25
26                    result.add(Arrays.asList(
27                        nums[i],
28                        nums[left],
29                        nums[right]
30                    ));
31
32                    // Skip duplicates
33                    while (left < right && nums[left] == nums[left + 1]) {
34                        left++;
35                    }
36
37                    while (left < right && nums[right] == nums[right - 1]) {
38                        right--;
39                    }
40
41                    left++;
42                    right--;
43
44                } 
45                else if (sum < 0) {
46                    left++;
47                } 
48                else {
49                    right--;
50                }
51            }
52        }
53
54        return result;
55    }
56}