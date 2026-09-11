// Last updated: 11/09/2026, 10:14:01
1class Solution {
2    public int passwordStrength(String password) {
3        int c=0;
4        HashSet<Character> set=new HashSet<>();
5        for(char x:password.toCharArray()){
6            if(set.contains(x)) continue;
7            if(x>='a'&&x<='z') c+=1;
8            else if(x>='A'&&x<='Z') c+=2;
9            else if(x>='0'&&x<='9') c+=3;
10            else c+=5;
11            set.add(x);
12        }
13        return c;
14    }
15}