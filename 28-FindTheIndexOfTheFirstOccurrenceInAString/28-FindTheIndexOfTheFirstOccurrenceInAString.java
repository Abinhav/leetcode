// Last updated: 14/07/2026, 14:03:20
class Solution {
    public int strStr(String haystack, String needle) {
        int m=haystack.length();
        int n=needle.length();
        if(m==n && haystack.equals(needle)){
            return 0;
        }
        for(int i=0;i<=m-n;i++){
            String sub=haystack.substring(i,i+n);
            if(sub.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}