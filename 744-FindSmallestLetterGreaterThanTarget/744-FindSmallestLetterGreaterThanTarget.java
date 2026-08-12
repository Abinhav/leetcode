// Last updated: 12/08/2026, 10:27:50
1class Solution {
2    public char nextGreatestLetter(char[] letters, char target) {
3        HashSet<Character> set=new HashSet<>();
4        for(char x:letters){
5            if(x==target)continue;
6            set.add(x);
7        }
8        char c='a';
9        while(c<='z'){
10            if(set.contains(c)&&c>target){
11                return c;
12            }
13            c++;
14        }
15        return letters[0];
16    }
17}