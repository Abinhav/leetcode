// Last updated: 04/08/2026, 11:45:23
1class Solution {
2    public int reverseDegree(String s) {
3        HashMap<Character,Integer> map=new HashMap<>();
4        char c='a';
5        for(int i=26;i>0;i--){
6            map.put(c++,i);
7        }
8        int sum=0;
9        for(int i=0;i<s.length();i++){
10        char ch=s.charAt(i);
11        sum+=(i+1)*map.get(ch);
12        }
13        return sum;
14    }
15}