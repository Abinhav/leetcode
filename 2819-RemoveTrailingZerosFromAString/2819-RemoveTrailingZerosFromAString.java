// Last updated: 14/07/2026, 13:59:13
class Solution {
    public String removeTrailingZeros(String num) {
        int i=num.length()-1;
        while(i>=0&&num.charAt(i)=='0'){
           i--;
        }
       return num.substring(0,i+1);
    }
}