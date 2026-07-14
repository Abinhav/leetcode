// Last updated: 14/07/2026, 13:59:36
class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> map1=new HashMap<>();
        HashMap<String,Integer> map2=new HashMap<>();
        for(String x:words1){
            map1.put(x,map1.getOrDefault(x,0)+1);
        }
        for(String x:words2){
            map2.put(x,map2.getOrDefault(x,0)+1);
        }
        int c=0;
        for(String x:map1.keySet()){
            if(map1.get(x)==1 && map2.getOrDefault(x,0)==1){
                c++;
            }
        }
        return c;
    }
}