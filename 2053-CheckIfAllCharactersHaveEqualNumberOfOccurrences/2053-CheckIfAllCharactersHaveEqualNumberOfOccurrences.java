// Last updated: 14/07/2026, 13:59:41
class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char x:s.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int m=0;
        
          m=Math.max(m,map.get(s.charAt(0)));
        
        for(char x:s.toCharArray()){
            if(map.get(x)!=m){
               return false;
            }
        }
        return true;
    }
}