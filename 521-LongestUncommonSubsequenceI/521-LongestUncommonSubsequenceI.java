// Last updated: 14/07/2026, 14:01:21
class Solution {
    public int findLUSlength(String a, String b) {
        int n=a.length();
        if(n<b.length()){
            n=b.length();
        }
       if(a.equals(b)){
        return -1;
       }
        
       return n;
    }
}