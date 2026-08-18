// Last updated: 18/08/2026, 12:03:29
1class Solution {
2    public boolean isValid(String a) {
3      Stack<Character> st=new Stack<>();
4      for(char x:a.toCharArray()){
5        if(x=='['||x=='('||x=='{'){
6            st.push(x);
7        }
8        else{
9            if(st.isEmpty()) return false;
10            char top=st.pop();
11            if(x==')'&&top!='('||x=='}'&&top!='{'||x==']'&&top!='[') return false;
12        }
13      }
14      return st.isEmpty();
15    }
16}