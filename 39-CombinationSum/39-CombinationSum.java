// Last updated: 05/10/2026, 11:33:45
1class Solution {
2    public List<List<Integer>> combinationSum(int[] arr, int tar) {
3        List<List<Integer>> ans=new ArrayList<>();
4        List<Integer> cur=new ArrayList<>();
5        int n=arr.length;
6        sum(0,arr,ans,cur,tar,n);
7        return ans;
8    }
9    public static void sum(int i,int arr[],List<List<Integer>> ans,List<Integer> cur,int tar,int n){
10        if(tar<0) return;
11        if(i==n){
12            if(tar==0){
13                ans.add(new ArrayList<>(cur));
14            }
15            return;
16        }
17        cur.add(arr[i]);
18        tar-=arr[i];
19        sum(i,arr,ans,cur,tar,n);
20        cur.remove(cur.size()-1);
21        tar+=arr[i];
22        sum(i+1,arr,ans,cur,tar,n);
23    }
24}