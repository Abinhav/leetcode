// Last updated: 14/07/2026, 14:02:45
class Solution {
    public String reverseWords(String s) {
        s=s+" ";
        String w="";
        String n="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c!=' '){
                w+=c;
            }
            else{
                if (!w.equals("")) {          
                    n = w + " " + n;
                    w = "";
                }
            }
        }
        n=n.trim();
        return n;
    }
}