// Last updated: 14/07/2026, 14:01:33
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        if(p.length()>s.length()){
            return ans;
        }
        HashMap<Character,Integer> pmap=new HashMap<>();
        HashMap<Character,Integer> wmap=new HashMap<>();
        for(char x:p.toCharArray()){
            pmap.put(x,pmap.getOrDefault(x,0)+1);
        }
        int l=0;
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            wmap.put(ch,wmap.getOrDefault(ch,0)+1);
            if(r-l+1>p.length()){
                char rem=s.charAt(l);
                wmap.put(rem,wmap.get(rem)-1);
                if(wmap.get(rem)==0){
                    wmap.remove(rem);
                }
                l++;
            }
            if(pmap.equals(wmap)){
                ans.add(l);
            }
        }
        return ans;
    }
}