// Last updated: 25/07/2026, 14:37:22
1class Solution {
2    public int mostWordsFound(String[] sentences) {
3        int max=0;
4        for(int i=0;i<sentences.length;i++){
5           String s=sentences[i];
6           max=Math.max(count(s),max);
7        }
8        return max;
9    }
10    public int count(String s){
11        int c=1;
12        for(int i=0;i<s.length();i++){
13            char ch=s.charAt(i);
14            if(ch==' '){
15                c++;
16            }
17        }
18        return c;
19    }
20}