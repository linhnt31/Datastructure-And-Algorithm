/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemSolvingSkills;

import java.util.HashSet;

/**
 *
 * @author Linh Nguyen Thanh
 */
/*
https://app.codesignal.com/tournaments/R4QfP25sjo2o2EMjv/E
*/
public class diffirentSquares {
    int differentSquares(int[][] matrix) {
        HashSet<String> hs = new HashSet<String>();

        for(int i = 0 ; i < matrix.length-1;i++){
            for(int j = 0 ; j < matrix[0].length-1;j++){
                String temp = ""+matrix[i][j]+matrix[i][j+1]+matrix[i+1][j]+matrix[i+1][j+1];
                hs.add(temp);
            }
        }
        return hs.size();
}

}
