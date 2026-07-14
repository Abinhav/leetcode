// Last updated: 14/07/2026, 14:03:34
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        int temp = x;
        int rev = 0;

        while (x != 0) {
            int d = x % 10;
            rev = rev * 10 + d;
            x = x / 10;
        }

        return temp == rev;
    }
}