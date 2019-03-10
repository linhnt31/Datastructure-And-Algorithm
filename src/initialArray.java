
import Sorting.StdOut;
import java.util.Arrays;
import java.util.Scanner;

/*
 package Sorting;

import java.util.Arrays;
import java.util.Scanner;
import searchingAlgorithms.StdOut;

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
