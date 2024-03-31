package _00_LeetcodeQueSol;

public class Q48 {
    public static void main(String[] args) {

    }
    public void rotate(int[][] matrix) {
        transpose(matrix);
        for(int[] arr : matrix)
            reverse(arr);
    }

    public void transpose(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = i; j < matrix[0].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public void reverse(int[] arr){
        int i = 0, j = arr.length-1;
        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
