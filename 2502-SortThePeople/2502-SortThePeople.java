// Last updated: 14/07/2026, 13:59:21
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
       String arr[]=new String[names.length];
       HashMap<Integer,String> map=new HashMap<>();
       for(int i=0;i<names.length;i++){
        map.put(heights[i],names[i]);
       }
       Arrays.sort(heights);
       int ind=0;
       for(int i=heights.length-1;i>=0;i--){
        arr[ind++]=map.get(heights[i]);
       }
       return arr;
    }
}