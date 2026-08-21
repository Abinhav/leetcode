// Last updated: 21/08/2026, 14:23:55
1class Solution {
2    public int maxLengthBetweenEqualCharacters(String s) {
3        int max=-1;
4        for(int i=0;i<s.length();i++){
5            char ch=s.charAt(i);
6            for(int j=i+1;j<s.length();j++){
7                char bh=s.charAt(j);
8                if(ch==bh){
9                    max=Math.max(max,(j-i-1));
10                   
11                }
12
13            }
14        }
15        
16        return max;
17    }
18}