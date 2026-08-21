// Last updated: 21/08/2026, 12:03:08
1class Solution {
2    public List<Boolean> kidsWithCandies(int[] candies, int k) {
3       int max=0;
4       for(int x:candies) {
5        max=Math.max(max,x);
6       }
7       List<Boolean> ans=new ArrayList<>();
8       for(int x:candies){
9        if(x+k>=max){
10           ans.add(true);
11           
12        }
13        else{
14            ans.add(false);
15        }
16
17
18       }
19       return ans;
20    }
21    
22}