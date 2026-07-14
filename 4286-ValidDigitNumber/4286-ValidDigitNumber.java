// Last updated: 14/07/2026, 13:58:53
class Solution {
    public boolean validDigit(int n, int x) {
        String s=String.valueOf(n);
        String a=String.valueOf(x);
        if(s.charAt(0)!=a.charAt(0)){
            if(s.contains(a)){
                return true;
            }
        }
        return false;
    }
}