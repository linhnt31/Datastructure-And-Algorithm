package searchingAlgorithms;

import java.util.Scanner;

/**
 *
 * @author Linh Nguyen Thanh
 */

/*
Find the smallest and second smallest elements in an array
*/

public class smallestElements {
    
    //obj global
    public static Scanner sc = new Scanner(System.in);
    
    
    //Enter elements of array
    public static void initialArray(int[] a){
        StdOut.println("Enter value of array: ");
        for(int i = 0 ; i < a.length;i++){
            a[i] = sc.nextInt();
        }
    }
    
    
    //Display array
    public static void printArray(int[] a){
        for(int i = 0 ; i < a.length; i++){
            StdOut.print(a[i]+" ");
        }
        StdOut.println();
    }
    //Method 1: MergeSort
    //Time complexity: O(nlogn)
    
    //Method 2: 
    //Time complexity: O(n)
    
    public static String getSmallestElements(int[] arr){
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        
        //Find smallest element
        for(int i = 0 ; i < arr.length ; i++){
            smallest = Math.min(smallest, arr[i]);
        }
        
        //Find second smallest element
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != smallest){
                secondSmallest = Math.min(secondSmallest, arr[i]);
            }
        }
        return smallest + " " + secondSmallest;
    }
    //main
    public static void main(String[] args) {
        int[] arr = new int[5];
        initialArray(arr);
        StdOut.println("Array: ");
        printArray(arr);
        
        String res = getSmallestElements(arr);
        StdOut.println("Result: "+res);
    }
}
