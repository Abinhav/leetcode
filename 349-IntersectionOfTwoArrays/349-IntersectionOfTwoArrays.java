// Last updated: 14/07/2026, 14:01:48
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> a=new HashSet<>();
        HashSet<Integer> b=new HashSet<>();
        for(int x:nums1){
            a.add(x);
        }
        for(int x:nums2){
            if(a.contains(x)){
                b.add(x);
            }
        }
        int arr[]=new int[b.size()];
        int i=0;
        for(int x:b){
            arr[i++]=x;
        }
        return arr;
    }
}