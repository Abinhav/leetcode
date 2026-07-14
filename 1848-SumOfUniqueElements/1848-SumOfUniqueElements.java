// Last updated: 14/07/2026, 13:59:49
class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:nums){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }
            else{
                map.put(x,1);
            }
        }
        int sum=0;
        for(int x:map.keySet()){
            if(map.get(x)==1){
                 sum+=x;
            }
        }
        return sum;
    }
}