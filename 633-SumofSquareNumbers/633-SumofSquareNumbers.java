// Last updated: 13/08/2026, 15:43:29
1class Solution {
2    public boolean judgeSquareSum(int c) {
3        
4       long left=0;
5       long right=(long)Math.sqrt(c);
6       while(left<=right){
7        long sum=left*left+right*right;
8        if(sum==c){
9            return true;
10        }
11        else if(sum<c){
12            left++;
13        }
14        else{
15            right--;
16        }
17       }
18       return false;
19    }
20    
21}