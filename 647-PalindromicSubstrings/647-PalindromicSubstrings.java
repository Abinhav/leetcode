// Last updated: 14/07/2026, 14:01:04
class Solution {
    public int countSubstrings(String s) {
        int c=0;
     for(int i=0;i<s.length();i++){
        String a="";
        for(int j=i;j<s.length();j++){
            char ch=s.charAt(j);
            a+=ch;
            if(palin(a)){
              c++;
            }
        }
     }
     return c;
    }
    public boolean palin(String s){
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)==s.charAt(r)){
                l++;
                r--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}