// Last updated: 12/08/2026, 10:13:45
1class Solution {
2    public int[] findErrorNums(int[] nums) {
3        HashSet<Integer> set=new HashSet<>();
4        int arr[]=new int[2];
5        int max=0;
6        HashMap<Integer,Integer> map=new HashMap<>();
7        for(int x:nums){
8            max=Math.max(max,x);
9            map.put(x,map.getOrDefault(x,0)+1);
10        }
11        for(int i=0;i<nums.length;i++){
12            set.add(nums[i]);
13        }
14         int j=0;
15        for(int x:set){
16            if(map.get(x)>1){
17                arr[j++]=x;
18            }
19        }
20       
21       for(int i=1;i<=nums.length;i++){
22        if(!set.contains(i)){
23            arr[j++]=i;
24        }
25       }
26       return arr;
27    }
28}