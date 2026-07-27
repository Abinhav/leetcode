// Last updated: 27/07/2026, 10:59:28
1class Solution {
2    public boolean strongPasswordCheckerII(String s) {
3        if(s.length()<8){
4            return false;
5        }
6        if(!check(s)){
7            return false;
8        }
9       int l=0,u=0,d=0,st=0;
10       for(int i=0;i<s.length();i++) {
11        char c=s.charAt(i);
12        if(Character.isUpperCase(c)){
13            u++;
14        }
15        else if(Character.isLowerCase(c)){
16            l++;
17        }
18        else if(Character.isDigit(c)){
19            d++;
20        }
21        else{
22            st++;
23        }
24       }
25       if(l>=1&&u>=1&&d>=1&&st>=1){
26        return true;
27       }
28       return false;
29    }
30   public static boolean check(String s){
31    for(int i=1;i<s.length();i++){
32        if(s.charAt(i)==s.charAt(i-1)){
33            return false;
34        }
35    }
36    return true;
37   }
38}