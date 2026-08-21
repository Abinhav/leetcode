// Last updated: 21/08/2026, 14:03:59
1class Solution {
2    public String makeGood(String s) {
3       Stack<Character> st=new Stack<>();
4       for(char x:s.toCharArray()){
5           if(!st.isEmpty()&&Character.isUpperCase(x)&& Character.isLowerCase(st.peek())){
6            if(st.peek()==Character.toLowerCase(x)){
7                st.pop();
8                  continue;
9            }
10            
11        }
12        if(!st.isEmpty()&&Character.isLowerCase(x)&&Character.isUpperCase(st.peek())){
13            if(st.peek()==Character.toUpperCase(x)){
14                st.pop();
15                continue;
16            }
17        }
18        st.push(x);
19       }
20       String w="";
21       if(!st.isEmpty()){
22       for(char x:st){
23        w+=x;
24       }
25       }
26       return w;
27       
28    }
29}