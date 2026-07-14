// Last updated: 14/07/2026, 14:00:39
class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int mlen=0;
        int l=0;
        int r=0;
        int n=fruits.length;
        while(r<n){
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
            if(map.size()>2){
                while(map.size()>2){
                    map.put(fruits[l],map.get(fruits[l])-1);
                    if(map.get(fruits[l])==0){
                        map.remove(fruits[l]);
                        
                    }
                    l++;
                }
            }
            if(map.size()<=2){
            mlen=Math.max(mlen,r-l+1);
            }
            r++;
        }
        return mlen;
    }
}