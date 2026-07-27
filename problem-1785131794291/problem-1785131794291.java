// Last updated: 27/07/2026, 11:26:34
1class Solution {
2    public String reversePrefix(String word, char ch) {
3        int l=0;
4        String w="";
5       
6        for(int i=0;i<word.length();i++){
7            char c=word.charAt(i);
8            
9            if(ch==c){
10                l=i+1;
11                break;
12            }
13            
14        }
15        if(l==0){
16            return word;
17        }
18        w=rev(word.substring(0,l))+word.substring(l,word.length());
19        return w;
20    }
21    public static String rev(String s){
22        String w="";
23        for(int i=s.length()-1;i>=0;i--){
24            w+=s.charAt(i);
25        }
26        return w;
27    }
28}