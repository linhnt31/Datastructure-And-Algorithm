/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myArray;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author silverbullet
 */
public class Array {
    Scanner sc = new Scanner(System.in);
    
    public Array(int[] a){
        System.out.println("Enter the element: ");
        for(int i = 0 ; i < a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println();
    }
    
    public static String printArray(int[] a){
        return Arrays.toString(a);
    }
}
