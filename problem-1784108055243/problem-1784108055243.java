// Last updated: 15/07/2026, 15:04:15
1class Solution {
2    public String removeStars(String s) {
3        Stack<Character> st=new Stack<>();
4        String w="";
5        for(char x:s.toCharArray()){
6            if(x=='*'){
7                st.pop();
8            }
9            else{
10                st.push(x);
11            }
12        }
13        StringBuilder ans=new StringBuilder();
14        while(!st.isEmpty()){
15            ans.append(st.pop());
16        }
17        return ans.reverse().toString();
18    }
19}