// Last updated: 27/07/2026, 12:00:44
1class Solution {
2    public long countVowels(String word) {
3       long sum=0;
4       long n=word.length();
5       for(int i=0;i<word.length();i++){
6        char c=word.charAt(i);
7        long temp=0;
8         if(check(c)){
9         temp=(i+1)*(n-i);
10         }
11         sum+=temp;
12       }
13       return sum;
14    }
15    public static boolean check(char ch){
16        //int c=0;
17        
18        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
19            return true;
20        }
21        
22        
23    
24    return false;
25    }
26}