// Last updated: 03/09/2026, 14:29:20
1class Solution {
2    public int countBinarySubstrings(String s) {
3        int prev=0;
4        int curr=1;
5        int ans=0;
6        for(int i=1;i<s.length();i++){
7            if(s.charAt(i)==s.charAt(i-1)){
8                curr++;
9            }
10            else{
11                ans+=Math.min(curr,prev);
12                prev=curr;
13                curr=1;
14            }
15        }
16        ans+=Math.min(curr,prev);
17        return ans;
18    }
19}