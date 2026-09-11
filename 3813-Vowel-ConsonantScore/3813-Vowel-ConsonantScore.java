// Last updated: 11/09/2026, 11:54:57
1class Solution {
2    public int vowelConsonantScore(String s) {
3        int v=0,c=0;
4        for(char x:s.toCharArray()){
5          if(check(x))v++;
6          else if(Character.isAlphabetic(x)) c++;
7        }
8        if(c==0) return 0;
9        return v/c;
10    }
11    public static boolean check(char c){
12        String s="AEIOUaeiou";
13        if(s.indexOf(c)!=-1) return true;
14        return false;
15    }
16}