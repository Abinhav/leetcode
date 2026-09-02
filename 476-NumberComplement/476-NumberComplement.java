// Last updated: 02/09/2026, 15:05:53
1class Solution {
2    public int findComplement(int num) {
3        String s=Integer.toBinaryString(num);
4        String w="";
5        for(char x:s.toCharArray()){
6            if(x=='0') w+='1';
7            if(x=='1') w+='0';
8        }
9        return Integer.parseInt(w,2);
10    }
11}