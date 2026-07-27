// Last updated: 27/07/2026, 11:25:29
1class Solution {
2    public String reversePrefix(String word, char ch) {
3        int l=0;
4        String w="";
5        for(char c:word.toCharArray()){
6            if(c==ch){
7                l++;
8            }
9        }
10        if(l==0){
11            return word;
12        }
13        else{
14            l=0;
15        }
16        for(int i=0;i<word.length();i++){
17            char c=word.charAt(i);
18            l++;
19            if(ch==c){
20                break;
21            }
22            
23        }
24        if(l==0){
25            return word;
26        }
27        w=rev(word.substring(0,l))+word.substring(l,word.length());
28        return w;
29    }
30    public static String rev(String s){
31        String w="";
32        for(int i=s.length()-1;i>=0;i--){
33            w+=s.charAt(i);
34        }
35        return w;
36    }
37}