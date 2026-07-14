// Last updated: 14/07/2026, 13:59:24
class Solution {
    public String largestGoodInteger(String num) {

        String ans = "";

        for (int i = 0; i <= num.length() - 3; i++) {

            char a = num.charAt(i);
            char b = num.charAt(i + 1);
            char c = num.charAt(i + 2);

            if (a == b && b == c) {

                String temp = num.substring(i, i + 3);

                if (ans.equals("") || temp.compareTo(ans) > 0) {
                    ans = temp;
                }
            }
        }

        return ans;
    }
}