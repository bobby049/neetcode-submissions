class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int min=matrix[n-1][m-1];
        int row=0;
        for(int i=0;i<n;i++){
            if((target -matrix[i][0])>0){
                if((target-matrix[i][0])>min){
                    min=target-matrix[i][0];
                    row=i;
                }
            }
        } 
        for(int i=0;i<m;i++){
            if(matrix[row][i]==target){
                return true;
            }
        }
           
        return false;
    }
}
