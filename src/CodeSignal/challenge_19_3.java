package CodeSignal;

/**
 *
 * @author Linh Nguyen Thanh
 */
/*
- problem link: https://app.codesignal.com/challenge/XghpbgQ6QM5mRdwXY
*/
public class challenge_19_3 {
    private int matrixElementsSum(int[][] matrix) {
        int sum = 0;

        for(int j = 0; j < matrix[0].length; j++){
            for(int i = 0; i < matrix.length; i++){
                if(matrix[i][j] > 0){
                    sum += matrix[i][j];
                }else{
                    break;
                }
            }
        }
        return sum;
    }

}
