/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemSolvingSkills;

import java.util.Arrays;

/**
 *
 * @author silverbullet
 */
public class test {
    //main
    public static void main(String[] args) {
        int[][] a = new int[3][];
        int[] b = new int[]{1, 0, 2};
        
        for(int i = 0 ; i < a.length;i++){
            a[i] = new int[b[i]];
            for(int j = 0 ; j < b[i];j++){
                a[i][j] = j;
            }
        }
        
        
    }
    
}
