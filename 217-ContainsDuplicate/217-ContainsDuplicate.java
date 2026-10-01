// Last updated: 01/10/2026, 16:18:11
1public class Solution {
2    public static boolean containsDuplicate(int[] nums) {
3        HashSet<Integer> set=new HashSet<>();
4        for(int x:nums){
5            if(set.contains(x)) return true;
6            set.add(x);
7        }
8        return false;
9    }
10}