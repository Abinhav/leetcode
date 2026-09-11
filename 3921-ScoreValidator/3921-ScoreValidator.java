// Last updated: 11/09/2026, 09:21:01
1class Solution {
2    public int[] scoreValidator(String[] e) {
3        int s=0,c=0;
4        for(int i=0;i<e.length;i++){
5            if(check(e[i])){
6                s+=Integer.parseInt(e[i]);
7            }
8            if(e[i].equals("W")) c+=1;
9            if(e[i].equals("WD")) s+=1;
10            if(e[i].equals("NB")) s+=1;
11            if(c==10) return new int[]{s,c};
12        }
13        return new int[]{s,c};
14    }
15    public static boolean check(String s){
16    for (int i = 0; i < s.length(); i++) {
17    if (s.charAt(i) < '0' || s.charAt(i) > '9') {
18        return false;
19    }
20}
21  return true;
22    }
23}