class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int n = matrix.length;
        int m = matrix[0].length;

        int min = Integer.MAX_VALUE;
        int row = 0;

        for (int i = 0; i < n; i++) {

            int diff = target - matrix[i][0];

            if (diff >= 0) {
                if (diff < min) {
                    min = diff;
                    row = i;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            if (matrix[row][i] == target) {
                return true;
            }
        }

        return false;
    }
}