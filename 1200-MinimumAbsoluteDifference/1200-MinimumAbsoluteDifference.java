// Last updated: 04/08/2026, 13:53:33
1class Solution {
2    public List<List<Integer>> minimumAbsDifference(int[] arr) {
3        Arrays.sort(arr);
4        int min=Integer.MAX_VALUE;
5        for(int i=0;i<arr.length-1;i++){
6            min=Math.min(min,Math.abs(arr[i]-arr[i+1]));
7        }
8        List<List<Integer>> ans=new ArrayList<>();
9        for(int i=0;i<arr.length-1;i++){
10            List<Integer> cur=new ArrayList<>();
11            if(Math.abs(arr[i]-arr[i+1])==min){
12                cur.add(arr[i]);
13                cur.add(arr[i+1]);
14                ans.add(new ArrayList(cur));
15            }
16        }
17        return ans;
18    }
19}