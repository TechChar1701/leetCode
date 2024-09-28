package src.StriverSDE;

public class TDMatrix {
    public static void main(String[] args) {

        int[][] matrix= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=3;
        searchMatrix(matrix,target);
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
//        for(int i =0;i< matrix.length;i++){
//            for(int j=0; j<matrix[0].length;j++){
//                if(matrix[i][j]==target){
//                    return true;
//                }
//            }
//        }
        int n = matrix.length;
        int m= matrix[0].length;
        int low =0;
        int high =(n*m)-1;
        while (low<=high){
            int mid= low+high/2;
            int row = mid/m;
            int col = mid%m;
            int element = matrix[row][col];
            if (element == target) {
                return true;
            }
            else if(element<target){
                low= mid+1;
            }
            else {
                high= mid-1;
            }
        }
        return false;
    }
}
