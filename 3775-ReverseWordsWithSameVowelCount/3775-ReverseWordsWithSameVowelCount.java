// Last updated: 15/09/2026, 14:05:02
1class Solution {
2    public String reverseWords(String s) {
3        String arr[]=s.split(" ");
4        int c=count(arr[0]);
5        String ans="";
6        ans+=arr[0]+" ";
7        for(int i=1;i<arr.length;i++){
8            if(count(arr[i])==c){
9                arr[i]=rev(arr[i]);
10            }
11           ans=ans+arr[i]+" ";
12        }
13       
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