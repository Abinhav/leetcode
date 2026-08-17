// Last updated: 17/08/2026, 12:26:07
1class Solution {
2    public int[][] transpose(int[][] matrix) {
3        int ans[][]=new int[matrix[0].length][matrix.length];
4        for(int i=0;i<matrix.length;i++){
5            for(int j=0;j<matrix[0].length;j++){
6                
7                ans[j][i]= matrix[i][j];
8            }
9        }
10        return ans;
11    }
12}