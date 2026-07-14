// Last updated: 14/07/2026, 14:00:15
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        HashSet<Integer> a=new HashSet<>();
        for(int x:map.values()){
            if(a.contains(x)){
                return false;
            }
            a.add(x);
        }
        return true;
    }
}