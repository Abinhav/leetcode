// Last updated: 29/08/2026, 15:31:43
1class Solution {
2    public boolean halvesAreAlike(String s) {
3        String a=s.substring(0,s.length()/2);
4        String b=s.substring(s.length()/2);
5        int a1=0;
6        int a2=0;
7        String c="AEIOUaeiou";
8        for(char x:a.toCharArray()){
9              if(c.indexOf(x)!=-1) 
10              a1++;
11        }
12        for(char x:b.toCharArray()){
13            if(c.indexOf(x)!=-1)
14            a2++;
15        }
16        return a1==a2;
17    }
18}