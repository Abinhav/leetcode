// Last updated: 14/07/2026, 14:03:04
class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int c=0;
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch==' '){
                break;
            }
            else{
                c++;
            }
        }
        return c;
    }
}