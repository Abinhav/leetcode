// Last updated: 11/09/2026, 12:19:07
1class Solution {
2    public String reverseByType(String s) {
3        Stack<Character> st=new Stack<>();
4        Stack<Character> at=new Stack<>();
5        for(char x:s.toCharArray()){
6            if(Character.isAlphabetic(x)) st.push(x);
7            else at.push(x);
8        }
9        StringBuilder ans=new StringBuilder();
10        for(char x:s.toCharArray()){
11            if(Character.isAlphabetic(x)){
12                ans.append(st.pop());
13            }
14            else{
15                ans.append(at.pop());
16            }
17        }
18        return ans.toString();
19    }
20}