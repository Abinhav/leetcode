// Last updated: 16/08/2026, 19:24:44
1class Solution {
2
3    public int primePalindrome(int n) {
4
5        // Small prime palindromes
6        if (n <= 2) return 2;
7        if (n <= 3) return 3;
8        if (n <= 5) return 5;
9        if (n <= 7) return 7;
10        if (n <= 11) return 11;
11
12        // Generate odd-length palindromes
13        for (int prefix = 10; prefix < 100000; prefix++) {
14
15            String left = String.valueOf(prefix);
16
17            String reverse = new StringBuilder(left.substring(0, left.length() - 1))
18                    .reverse()
19                    .toString();
20
21            int palindrome = Integer.parseInt(left + reverse);
22
23            if (palindrome >= n && isPrime(palindrome)) {
24                return palindrome;
25            }
26        }
27
28        return -1;
29    }
30
31    public boolean isPrime(int n) {
32
33        if (n < 2) {
34            return false;
35        }
36
37        if (n == 2) {
38            return true;
39        }
40
41        if (n % 2 == 0) {
42            return false;
43        }
44
45        for (int i = 3; i * i <= n; i += 2) {
46
47            if (n % i == 0) {
48                return false;
49            }
50        }
51
52        return true;
53    }
54}