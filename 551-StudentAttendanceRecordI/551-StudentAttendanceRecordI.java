// Last updated: 16/08/2026, 18:51:39
1class Solution {
2    public boolean checkRecord(String s) {
3        int c=0,d=0;
4        for(int i=0;i<s.length();i++){
5            char ch=s.charAt(i);
6            if(ch=='L'){
7                c++;
8            }
9            else{
10                c=0;
11                if(ch=='A'){
12                  d++;
13                }
14            }
15            if(c>=3){
16                return false;
17            }
18        }
19        if(c<3&&d<2){
20            return true;
21        }
22        return false;
23    }
24}