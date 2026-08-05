// Last updated: 05/08/2026, 15:00:04
1class Solution {
2    public int[] findThePrefixCommonArray(int[] a, int[] b) {
3        int c[]=new int[a.length];
4        int k=0;
5        if(a[0]==b[0]){
6            c[k++]=1;
7        }
8        else{
9            c[k++]=0;
10        }
11        HashSet<Integer> set=new HashSet<>();
12        set.add(a[0]);
13        for(int i=1;i<b.length;i++){
14            set.add(a[i]);
15            int f=0;
16            for(int j=0;j<=i;j++){
17             if(set.contains(b[j])){
18                f++;
19             }
20            }
21            c[k++]=f;
22        }
23        return c;
24    }
25}