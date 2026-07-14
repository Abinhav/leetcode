// Last updated: 14/07/2026, 14:01:35
class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>();
        int l=0,r=0,mlen=0,mfreq=0;
        while(r<s.length()){
            char c=s.charAt(r);
            map.put(c,map.getOrDefault(c,0)+1);
            mfreq=Math.max(mfreq,map.get(c));
            while((r-l+1)-mfreq>k){
                char ch=s.charAt(l);
                map.put(ch,map.get(ch)-1);
                l++;
            }
            mlen=Math.max(mlen,r-l+1);
            r++;
        }
        return mlen;
    }
}