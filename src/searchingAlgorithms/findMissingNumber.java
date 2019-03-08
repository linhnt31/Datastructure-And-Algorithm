package searchingAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Linh Nguyen Thanh
 */

/* Problem: You are given a list of n-1 integers and these integers are in the range of 1 to n.
There are no duplicates in list. One of the integers is missing in the list.
Write an efficient code to find the missing integer.*/

public class findMissingNumber {
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
    }
    
    //Method 1: 
    //Time complextity: O(nlogn)
    //Space complexity: 
    public static int missingNumber(int[] arr){
        Arrays.sort(arr);
        for(int i = 0 ; i < arr.length - 1; i++){
            if(arr[i+1]-arr[i] != 1){
                return arr[i] + 1;
            }
        }
        return -1;
    }
    
    
    //Method 2: Use the fomula n*(n+1)/2
    //time complexity: 
    //Space complexity: 
    public static int missingNumber2(int[] arr){
        //because first element is 1 --> value of last elements  = len + 1
        int lastElement = arr.length + 1;
        //var sumOfArray is missingNumber after loop for
        int sumOfArray = lastElement * (lastElement + 1) / 2;
      
        for(int i = 0 ; i < arr.length; i++){
            sumOfArray -= arr[i];
        }
        return sumOfArray;
    }
    
    
    //main
    public static void main(String[] args) {
        int[] arr = new int[7];
        initialArray(arr);
        StdOut.println("Array: ");
        
        //Method 1:
//        int missingNumber = missingNumber(arr);
        int missingNumber = missingNumber2(arr);
        if(missingNumber == -1){
            StdOut.println("Not found");
        }else{
            StdOut.println("The missing number is : "+ missingNumber);
        }
    }
}
