package problemSolvingSkills;

/**
 *
 * @author Linh Nguyen Thanh
 */
/*
In the popular Minesweeper game you have a board with some mines and
those cells that don't contain a mine have a number in it that indicates the total number of mines in the neighboring cells.
Starting off with some arrangement of mines we want to create a Minesweeper game setup.

Example

For

matrix = [[true, false, false],
          [false, true, false],
          [false, false, false]]

the output should be

minesweeper(matrix) = [[1, 2, 1],
                       [2, 1, 1],
                       [1, 1, 1]]



*/
public class mineSweeper {
    
    int[][] minesweeper(boolean[][] matrix) {
    int row = matrix.length;
    int column = matrix[0].length;
    int[][] res = new int[row][column];
    
    for(int i = 0 ; i < row;i++){

        for(int j = 0 ; j < column;j++){
            int count = 0;
            if(i + 1 < row && j + 1 < column && matrix[i+1][j+1] == true) count++;
            if(  i + 1 < row && matrix[i+1][j] == true) count++;
            if( j + 1 < column && matrix[i][j+1] == true ) count++;
            if(i - 1 >= 0 && j + 1 < column && matrix[i-1][j+1] == true ) count++;
            if( i - 1 >= 0 && j - 1 >= 0 && matrix[i-1][j-1] == true ) count++;
            if(  j - 1 >= 0 && matrix[i][j-1] == true) count++;
            if(i - 1 >= 0 && matrix[i-1][j] == true) count++;
            if(i + 1 < row && j - 1 >= 0 && matrix[i+1][j-1] == true) count++;
            
            if(count == 0){
                res[i][j] += 0;
            }
            else{
                res[i][j] += count;
            }
        }
    }
    return res;
}

}
