// Last updated: 17/08/2026, 12:36:51
1class Solution {
2    public int diagonalSum(int[][] mat) {
3        int sum=0;
4        int r=mat.length;
5        int c=mat[0].length;
6        for(int i=0;i<r;i++){
7            for(int j=0;j<c;j++){
8                if(i==j){
9                    sum+=mat[i][j];
10                    sum+=mat[i][r-i-1];
11                }
12                
13            }
14        }
15        if(r%2!=0){
16            sum-=mat[r/2][c/2];
17        }
18        return sum;
19    }
20}