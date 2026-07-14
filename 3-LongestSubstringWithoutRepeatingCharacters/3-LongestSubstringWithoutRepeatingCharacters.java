// Last updated: 14/07/2026, 14:03:40
class Solution {
    public int lengthOfLongestSubstring(String s) {
     HashSet<Character> set=new HashSet<>();
     int mlen=0;
     int l=0;
     for(int r=0;r<s.length();r++){
        char c=s.charAt(r);
        while(set.contains(c)){
            char ch=s.charAt(l);
            set.remove(ch);
            l++;
        }
        mlen=Math.max(mlen,r-l+1);
        set.add(c);
     }
     return mlen;
    }
}