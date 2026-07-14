// Last updated: 14/07/2026, 14:00:19
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int dup[]=arr.clone();
        Arrays.sort(dup);
        HashMap<Integer,Integer> a=new HashMap<>();
        int rank=1;
        for(int num:dup){
            if(!a.containsKey(num)){
                a.put(num,rank);
                rank++;
            }
        }
        for(int i=0;i<arr.length;i++){
           arr[i]=a.get(arr[i]);
        }
        return arr;
    }
}