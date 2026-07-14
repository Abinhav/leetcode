// Last updated: 14/07/2026, 14:03:01
class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstrow=false;
        boolean firstcol=false;
        int row=matrix.length;
        int col=matrix[0].length;

        for(int i=0;i<row;i++){
            if(matrix[i][0]==0){
                firstcol=true;
            }
        }
        for(int j=0;j<col;j++){
            if(matrix[0][j]==0){
                firstrow=true;
            }
        }
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(matrix[i][j]==0){
                   
                    matrix[i][0]=0;
                     matrix[0][j]=0;
                }
            }
        }
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(matrix[i][0]==0||matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(firstrow){
            for(int j=0;j<col;j++){
                matrix[0][j]=0;
            }
        }
        if(firstcol){
            for(int i=0;i<row;i++){
                matrix[i][0]=0;
            }
        }
    }
}