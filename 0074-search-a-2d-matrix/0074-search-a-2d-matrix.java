class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int l=0; //CONVERTING MATRIX TO LARGE ARRAY, of rows*cols
        int r=rows*cols-1;
        while (l <= r) {
            int mid = l + (r - l) / 2;

            int row = mid / cols; //to get ROW of mid ele
            int col = mid % cols; //to get COL of mid ele (OFFSET)

            if (matrix[row][col] == target)      return true;
            else if (matrix[row][col] < target)  l = mid + 1;
            else                                 r = mid - 1;
            
        }
        return false;
    }
}