// Last updated: 31/08/2026, 11:42:45
1class Solution {
2    public int minSwaps(String s) {
3        Stack<Character> st=new Stack<>();
4        int c=0;
5        for(char x:s.toCharArray()){
6            if(x=='['){
7                st.push(x);
8            }
9            else{
10                if(!st.isEmpty()){
11                    st.pop();
12                }
13                else{
14                    c++;
15                }
16            }
17        }
18        return (c+1)/2;
19    }
20}