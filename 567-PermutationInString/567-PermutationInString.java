// Last updated: 14/07/2026, 14:01:13
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        HashMap<Character,Integer> pmap=new HashMap<>();
        HashMap<Character,Integer> wmap=new HashMap<>();
        for(char x:s1.toCharArray()){
            pmap.put(x,pmap.getOrDefault(x,0)+1);
        }
        int l=0;
        for(int r=0;r<s2.length();r++){
            char ch=s2.charAt(r);
            wmap.put(ch,wmap.getOrDefault(ch,0)+1);
            if(r-l+1>s1.length()){
                char rem=s2.charAt(l);
                wmap.put(rem,wmap.get(rem)-1);
                if(wmap.get(rem)==0){
                    wmap.remove(rem);
                }
                l++;
            }
            if(pmap.equals(wmap)){
                return true;
            }
            
        }
        return false;
    }
}