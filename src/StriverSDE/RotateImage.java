package src.StriverSDE;

public class RotateImage {
    public static void main(String[] args) {

    }
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i =0; i<matrix.length;i++){
            for(int j =i+1; j< matrix.length;j++){
                swap(i, j, matrix);
            }
        }
        for(int i =0;i< matrix.length;i++){
            reverseRow(matrix[i]);
        }
    }
    static void swap(int i , int j , int[][]  matrix){
        int temp = 0;
        temp= matrix[i][j];
        matrix[i][j]= matrix[j][i];
        matrix[j][i]= temp;

    }
    static void reverseRow(int[] row) {
        int left= 0;
        int right = row.length;
        while (left<=right){
            int temp = row[left];
            row[left]= row[right];
            row[right]= temp;
            left++;
            right--;
        }
    }
}
