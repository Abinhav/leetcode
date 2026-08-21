// Last updated: 21/08/2026, 09:33:37
1class Solution {
2    public String sortVowels(String s) {
3        char arr[]=new char[count(s)];
4        int i=0;
5        for(char x:s.toCharArray()){
6            if(bool(x)){
7                arr[i++]=x;
8            }
9        }
10        Arrays.sort(arr);
11        String w="";
12        i=0;
13        for(char x:s.toCharArray()){
14          if(bool(x)){
15            w+=arr[i++];
16            continue;
17          }
18          w+=x;
19        }
20        return w;
21    }
22    public static int count(String s){
23        String a="AEIOUaeiou";
24        int c=0;
25        for(char x:s.toCharArray()){
26            if(a.indexOf(x)!=-1){
27                c++;
28            }
29        }
30        return c;
31    }
32    public static boolean bool(char a){
33        String s="AEIOUaeiou";
34        if(s.indexOf(a)!=-1){
35            return true;
36        }
37        return false;
38    }
39}