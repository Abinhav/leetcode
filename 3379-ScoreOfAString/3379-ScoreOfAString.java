// Last updated: 14/07/2026, 13:59:01
class Solution {
    public int scoreOfString(String s) {
        int sc=0;
        for(int i=1;i<s.length();i++){
            sc+=Math.abs(s.charAt(i)-s.charAt(i-1));
        }
        return sc;
    }
}