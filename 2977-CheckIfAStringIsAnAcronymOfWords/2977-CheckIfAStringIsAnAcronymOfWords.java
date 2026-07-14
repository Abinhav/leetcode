// Last updated: 14/07/2026, 13:59:11
class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if(words.size()!=s.length()){
            return false;
        }
        for(int i=0;i<words.size();i++){
           String temp=words.get(i);
           char c=temp.charAt(0);
           if(c!=s.charAt(i)){
            return false;
           }
        }
        
        return true;
    }
}