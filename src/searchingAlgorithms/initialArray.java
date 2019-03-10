/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchingAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author silverbullet
 */
public class initialArray {
    
    Scanner sc = new Scanner(System.in);
            
    public initialArray(int[] arr) {
        StdOut.println("Enter elements of array: ");
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }
    
    //Display array
    public static String Print(int[] arr){
        return Arrays.toString(arr);
    }
    
}
