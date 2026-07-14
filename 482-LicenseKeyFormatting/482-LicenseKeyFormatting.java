// Last updated: 14/07/2026, 14:01:27
class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder ans=new StringBuilder();
        int c=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='-'){
                continue;
            }
            if(c==k){
                ans.append('-');
                c=0;
            }
            ans.append(Character.toUpperCase(s.charAt(i)));
            c++;
        }
        return ans.reverse().toString();
    }
}