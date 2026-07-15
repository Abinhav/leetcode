// Last updated: 15/07/2026, 15:01:25
1class Solution {
2    public String clearDigits(String s) {
3        Stack <Character> st=new Stack<>();
4        for(char x:s.toCharArray()){
5            if(Character.isDigit(x)){
6                st.pop();
7            }
8            else{
9                st.push(x);
10            }
11        }
12        StringBuilder ans=new StringBuilder();
13        while(!st.isEmpty()){
14            ans.append(st.pop());
15        }
16        return ans.reverse().toString();
17    }
18}