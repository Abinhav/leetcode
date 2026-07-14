// Last updated: 14/07/2026, 13:59:03
class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:nums){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }
            else{
                map.put(x,1);
            }
        }
            int max=0;
            for(int x:map.values()){
                max=Math.max(max,x);
            }
            int total=0;
            for(int x:map.values()){
                if(x==max){
                    total+=x;
                }
            }
        
        return total;
    }
}