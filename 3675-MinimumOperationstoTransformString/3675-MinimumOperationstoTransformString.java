// Last updated: 04/08/2026, 12:28:50
1class Solution {
2    public int minOperations(String s) {
3        
4        char arr[]=s.toCharArray();
5        Arrays.sort(arr);
6        char c=arr[0];
7        int i=0;
8        if(arr[s.length()-1]=='a')return 0;
9        while(c=='a'&&i<s.length()){
10            c=arr[i++];
11        }
12        int ans=0;
13        while(c!='z'){
14         c++;
15         ans++;
16        }
17        return ans+1;
18    }
19}