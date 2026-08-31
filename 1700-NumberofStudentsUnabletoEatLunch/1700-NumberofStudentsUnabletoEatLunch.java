// Last updated: 31/08/2026, 10:37:39
1class Solution {
2    public int countStudents(int[] s, int[] san) {
3        Queue<Integer> q=new LinkedList<>();
4        Stack<Integer> st=new Stack<>();
5        for(int x:s) q.add(x);
6        for(int i=san.length-1;i>=0;i--){
7            st.add(san[i]);
8        }
9        int rot=0;
10        while(!q.isEmpty() && rot<q.size()){
11            if(q.peek()==st.peek()){
12                q.remove();
13                st.pop();
14                rot=0;
15            }
16            else{
17                q.add(q.remove());
18                rot++;
19            }
20        }
21        return q.size();
22    }
23}