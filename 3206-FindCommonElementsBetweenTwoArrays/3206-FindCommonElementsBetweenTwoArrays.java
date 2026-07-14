// Last updated: 14/07/2026, 13:59:06
class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int x:nums1){
            set1.add(x);
        }
        for(int x:nums2){
            set2.add(x);
        }
        int ans1=0;
        int ans2=0;
        for(int x:nums1){
           if(set2.contains(x)){
            ans1++;
           }
        }
        for(int x:nums2){
            if(set1.contains(x)){
                ans2++;
            }
        }
        return new int[]{ans1,ans2};
    }
}