// Last updated: 15/09/2026, 14:01:52
1class Solution {
2    public String reverseWords(String s) {
3        String arr[]=s.split(" ");
4        int c=count(arr[0]);
5        for(int i=1;i<arr.length;i++){
6            if(count(arr[i])==c){
7                arr[i]=rev(arr[i]);
8            }
9        }
10        String ans="";
11        for(int i=0;i<arr.length;i++){
12            ans=ans+arr[i]+" ";
13        }
14        return ans.trim();
15    }
16    public static boolean check(char c){
17        String s="AEIOUaeiou";
18        if(s.indexOf(c)!=-1) return true;
19        return false;
20    }
21    public static int count(String s){
22        int c=0;
23        for(char x:s.toCharArray()){
24            if(check(x)) c++;
25        }
26        return c;
27    }
28    public static String rev(String s){
29        String w="";
30        for(int i=s.length()-1;i>=0;i--){
31            w+=s.charAt(i);
32        }
33        return w;
34    }
35}