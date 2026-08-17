// Last updated: 17/08/2026, 15:09:24
1class Solution {
2    public boolean squareIsWhite(String s) {
3        //int arr[][]=new int[8][8];
4        int arr[][]={{0,1,0,1,0,1,0,1},
5                 {1,0,1,0,1,0,1,0},
6                 {0,1,0,1,0,1,0,1},
7                 {1,0,1,0,1,0,1,0},
8                 {0,1,0,1,0,1,0,1},
9                 {1,0,1,0,1,0,1,0},
10                 {0,1,0,1,0,1,0,1},
11                 {1,0,1,0,1,0,1,0}};
12
13        HashMap<Character,Integer> map=new HashMap<>();
14        HashMap<Character,Integer> mp=new HashMap<>();
15        char c='a';
16        char n='1';
17        for(int i=0;i<=8;i++){
18          map.put(n,i);
19          mp.put(c,i);
20          c++;
21          n++;
22        }
23        int a=0,b=0;
24        a=mp.get(s.charAt(0));
25        b=map.get(s.charAt(1));
26        if(arr[a][b]==1){
27            return true;
28        }
29        return false;
30    }
31}