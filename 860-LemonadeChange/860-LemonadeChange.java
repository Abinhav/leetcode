// Last updated: 12/09/2026, 10:41:28
1class Solution {
2    public boolean lemonadeChange(int[] bills) {
3        int f=0,t=0;
4        for(int i=0;i<bills.length;i++){
5            if(bills[i]==5) f++;
6            if(bills[i]==10){
7                if(f==0) return false;
8                f--;
9                t++;
10            }
11            if(bills[i]==20){
12                if(f!= 0&& t!=0){
13                    f--;
14                    t--;
15                }
16                else if(f>=3) f-=3;
17                else return false;
18            }
19        }
20        return true;
21    }
22}