package _05_Searching;

import java.util.Arrays;

public class BinarySearch2D {

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 4, 5}, {4, 2, 1, 5}, {7, 6, 4, 9}};
        int target = 9;
        System.out.println("Unsorted ::" + Arrays.toString(nonSorted(mat, target)));

//        ------------------------------------------------------------------------

        int[][] mat1 = {{1, 4, 7, 8}, {2, 5, 8, 8}, {7, 7, 8, 9}};
        System.out.println("rowNcol sorted ::" + Arrays.toString(rowNcolSorted(mat1, target)));
//        ------------------------------------------------------------------------

        int[][] mat2 = {{1, 4, 7, 9}, {12, 15, 18, 28}, {37, 47, 58, 59}};
        System.out.println("Sorted ::" + Arrays.toString(Sorted(mat2, target)));


    }

    public static int[] nonSorted(int[][] mat, int target) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == target) return new int[]{i, j};
            }
        }

        return new int[]{-1, -1};
    }

    public static int[] rowNcolSorted(int[][] mat, int target) {
        int row = 0;
        int col = mat[0].length - 1;

        while (row < mat.length && col >= 0) {
            if (mat[row][col] == target) return new int[]{row, col};
            else if (mat[row][col] < target) row++;
            else col--;
        }

        return new int[]{-1, -1};
    }


    public static int[] Sorted(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[]{-1, -1}; // Return {-1, -1} if the matrix is invalid.
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = matrix[mid / cols][mid % cols];

            if (midValue == target) {
                return new int[]{mid / cols, mid % cols}; // Return indices if target is found.
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return new int[]{-1, -1};
    }


}
