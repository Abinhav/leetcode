// Last updated: 21/08/2026, 14:44:41
class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (j < spaces.length && i == spaces[j]) {
                sb.append(" ");
                i--;
                j++;
            } else sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}