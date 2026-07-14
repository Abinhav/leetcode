// Last updated: 14/07/2026, 13:59:29
class Solution {
    public int prefixCount(String[] words, String pref) {
        int c=0;
        for(int i=0;i<words.length;i++){
          String w=words[i];
          if(w.startsWith(pref)){
            c++;
          }
        }
        return c;
    }
}