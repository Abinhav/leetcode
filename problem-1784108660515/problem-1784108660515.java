// Last updated: 15/07/2026, 15:14:20
1class Solution {
2    public boolean backspaceCompare(String s, String t) {
3        Stack<Character> st=new Stack<>();
4        Stack<Character> se=new Stack<>();
5        for(char x:s.toCharArray()){
6            if(x=='#'){
7                if(!st.isEmpty())
8                st.pop();
9            }
10            else{
11                st.push(x);
12            }
13        }
14        for(char x:t.toCharArray()){
15            if(x=='#'){
16                if(!se.isEmpty())
17                se.pop();
18            }
19            else{
20                se.push(x);
21            }
22        }
23        return st.equals(se);
24    }
25}