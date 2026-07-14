// Last updated: 14/07/2026, 14:00:07
class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> a=new HashMap<>();
        for(int x:arr){
            if(a.containsKey(x)){
                a.put(x,a.get(x)+1);
            }
            else{
                a.put(x,1);
            }
        }
        int ans=-1;
        for(int x:a.keySet()){
            if(x==a.get(x)){
                ans=Math.max(ans,x);
            }
        }
        return ans;
    }
}