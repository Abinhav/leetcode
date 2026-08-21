// Last updated: 21/08/2026, 12:29:47
1class Solution {
2    public int maxProductDifference(int[] nums) {
3        if(check(nums)) return 0;
4        int max=0;
5        int min=Integer.MAX_VALUE;
6        for(int x:nums){
7            max=Math.max(max,x);
8            min=Math.min(min,x);
9        }
10        int s=sec(nums);
11        int sm=min(nums);
12        int con=0;
13        for(int x:nums){
14          if(x==max){
15            con++;
16          }
17        }
18        if(con>=2){
19            s=max;
20        }
21        con=0;
22        for(int x:nums){
23            if(x==min) con++;
24        }
25        if(con>=2) sm=min;
26        return (max*s)-(sm*min);
27    }
28    public static int sec(int arr[]){
29        int max=0;
30        int sec=0;
31        for(int x:arr){
32           max=Math.max(max,x);
33        }
34        for(int x:arr){
35            if(x==max) continue;
36            sec=Math.max(sec,x);
37        }
38        return sec;
39    }
40    public static int min(int[] arr){
41        int min=Integer.MAX_VALUE;
42        for(int x:arr){
43            min=Math.min(min,x);
44        }
45        int sec=Integer.MAX_VALUE;
46        for(int x:arr){
47            if(x==min){
48                continue;
49            }
50            sec=Math.min(x,sec);
51        }
52        return sec;
53    }
54    public static boolean check(int arr[]){
55        int c=0;
56        int a=arr[0];
57        for(int x:arr){
58        if(x==a) c++;
59        }
60       return c==arr.length;
61    }
62}