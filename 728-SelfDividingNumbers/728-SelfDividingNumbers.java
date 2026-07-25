// Last updated: 25/07/2026, 13:59:43
1class Solution {
2    public List<Integer> selfDividingNumbers(int left, int right) {
3        List<Integer> ans=new ArrayList<>();
4        for(int i=left;i<=right;i++){
5            if(check(i)){
6                ans.add(i);
7            }
8        }
9        return ans;
10    }
11    public static boolean check(int n){
12        int a=n;
13        while(a!=0){
14            int t=a%10;
15            if(t==0){
16                return false;
17            }
18            if(n%t!=0){
19                return false;
20            }
21            a/=10;
22        }
23        return true;
24    }
25}