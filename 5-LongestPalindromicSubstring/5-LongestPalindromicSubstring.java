// Last updated: 14/07/2026, 14:03:37
class Solution {
    public String longestPalindrome(String s) {
        int mlen=0;
        String ans="";
        int n=s.length();
       for(int i=0;i<n;i++){
    for(int j=i;j<n;j++){

        if(palin(s,i,j)){
            if(j-i+1 > mlen){
                mlen = j-i+1;
                ans = s.substring(i,j+1);
            }
        }
    }
}
        return ans;
    }
    public boolean palin(String s,int l,int r){
        
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}