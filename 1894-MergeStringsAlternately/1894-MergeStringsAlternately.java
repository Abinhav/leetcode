// Last updated: 14/07/2026, 13:59:47
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans=new StringBuilder();
        int i=0;
        int j=0;
        while(i<word1.length()&&j<word2.length()){
            ans.append(word1.charAt(i));
            ans.append(word2.charAt(j));
            i++;
            j++;
        }
        while(i<word1.length()){
            ans.append(word1.charAt(i));
            i++;
        }
        while(j<word2.length()){
            ans.append(word2.charAt(j));
            j++;
        }
        return ans.toString();
    }
}