package searchingAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Linh Nguyen Thanh
 */

/*
Median of two sorted arrays of same size

There are 2 sorted arrays A and B of size n each.
Write an algorithm to find the median of the array obtained after merging the above 2 arrays(i.e. array of length 2n). 
The complexity should be O(log(n)). */


public class medianTwoSortedArrays {
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
    
    
    //Method 1: Merge 2 arrays then sort
    //Time complexity: O(nlogn)
    //Space complexity: O(n) to store new array
    public static int medianOfTwoSortedArrays1(int[] arr1, int[] arr2){
        int median = 0;
        int[] newArray = new int[arr1.length + arr2.length];
        
        for(int i = 0; i < arr1.length + arr2.length; i++){
            if(i < arr1.length){
                newArray[i] = arr1[i];
            }else{
                newArray[i] = arr2[i-arr1.length];
            }
        }
        
        Arrays.sort(newArray);
        median += newArray[newArray.length/2 - 1] + newArray[newArray.length/2];
        
        return median / 2;
    }
    
    
    /*Chua hoan thanh*/
    //Method 2: Find median of two arrays
    //TIme complexity:
    //Space complexity: 
    
    public static int medianOfTwoArrays2(int[] arr1, int[] arr2, int len){
        
        return 0;
    }
    
    //main
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        
        initialArray(arr2);
        initialArray(arr1);
        
        int medianOfTwoArrays = medianOfTwoSortedArrays1(arr1, arr2);
        StdOut.println("Result: "+ medianOfTwoArrays);
    }
}
