// Last updated: 07/10/2026, 14:47:24
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3
4       String pre=strs[0];
5       for(int i=1;i<strs.length;i++){
6        while(!strs[i].startsWith(pre)){
7            pre=pre.substring(0,pre.length()-1);
8        }
9        if(pre==""){
10            return "";
11        }
12       }
13       return pre;
14    }
15}