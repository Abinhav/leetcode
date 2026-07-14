// Last updated: 14/07/2026, 14:02:37
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb=new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            char ch=(char)(columnNumber%26+'A');
            sb.append(ch);
            columnNumber/=26;
        }
        return sb.reverse().toString();
    }
}