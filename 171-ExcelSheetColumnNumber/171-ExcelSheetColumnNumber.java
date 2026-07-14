// Last updated: 14/07/2026, 14:02:34
class Solution {
    public int titleToNumber(String columnTitle) {
        int res=0;
        for(int i=0;i<columnTitle.length();i++){
            res=res*26+(columnTitle.charAt(i)-'A'+1);
        }
        return res;
    }
}