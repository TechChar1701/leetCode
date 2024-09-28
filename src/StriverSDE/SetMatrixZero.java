package src.StriverSDE;

import java.util.ArrayList;

public class SetMatrixZero {
    // Approach 1: mark column and rows as -1 and then again iterate  -1 ->0
    // Approach 2 : mark column and row and at last make zero

    static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        int[] row = new int[n];
        int[] col = new int[m];
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(matrix.get(i).get(j)==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i =0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 0 || row[j] == 0) {
                    matrix.get(i).set(j, 0);
                }
            }
        }
        return matrix;
    }
}
