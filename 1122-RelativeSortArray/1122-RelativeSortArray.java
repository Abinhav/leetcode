// Last updated: 07/08/2026, 12:18:13
1class Solution {
2    public int[] relativeSortArray(int[] arr1, int[] arr2) {
3        int arr[]=new int[arr1.length];
4        HashMap<Integer,Integer> map=new HashMap<>();
5        for(int x:arr1){
6            map.put(x,map.getOrDefault(x,0)+1);
7        }
8        int j=0;
9        for(int i=0;i<arr2.length;i++){
10            int c=0;
11            while(c<map.get(arr2[i])){
12                arr[j++]=arr2[i];
13                c++;
14            }
15        }
16        HashSet<Integer> st=new HashSet<>();
17        for(int x:arr2){
18            st.add(x);
19        }
20        TreeSet<Integer> set=new TreeSet<>();
21
22        for(int i=0;i<arr1.length;i++){
23          if(!st.contains(arr1[i])){
24            set.add(arr1[i]);
25          }
26        }
27        for(int x:set){
28            int c=0;
29            while(c<map.get(x)){
30            arr[j++]=x;
31            c++;
32            }
33        }
34        return arr;
35    }
36}