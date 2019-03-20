package CodeSignal;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Linh Nguyen Thanh
 */

/*
----------Link: https://app.codesignal.com/challenge/qd43krQ8ckyP83eKF-----------
Given an array of integers, sort its elements by the difference of their largest and smallest digits. 
In the case of a tie, that with the larger index in the array should come first.

Example

For a = [152, 23, 7, 887, 243], the output should be
digitDifferenceSort(a) = [7, 887, 23, 243, 152].


*/
public class digitDifferenceSort {
    
    
    //Method 1:
    //Time complexity: 
    private static int[] digitDiff(int[] a){
        int len = a.length;
        
        //reserve array
        reserve(a);
        //bubble sort
        for(int i = 0 ; i < len - 1;i++){
            boolean swapped = true;
            for(int j = 0 ; j < len - 1;j++){
                if(diffElements(a[j+1]) < diffElements(a[j])){
                    int temp = a[j+1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                    swapped = false;
                }
            }
            if(swapped == true){
                break;
            }
        }
        return a;
    }
    
    
    //Function to reserve array to remain positon of 2 element have diff equality
    private static void reserve(int[] a){
        for(int i = 0; i < a.length / 2; i++){
            int temp = a[a.length - i - 1];
            a[a.length -i - 1] = a[i];
            a[i] = temp;
        }
    }
    //Function to calculate diffirent between smallest and largest element
    private static int diffElements(int n){
        if(n < 10) return 0;
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        while(n > 0){
            int tmp = n % 10;
            max = Math.max(tmp, max);
            min = Math.min(tmp, min);
            
            n /= 10;
        }
        
        return max - min;
    }
    //main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int[] arr = new int[] {561, 798, 132, 339, 218, 724, 462, 332, 9, 343, 592, 34, 95, 292, 626, 970};
        int[] test = new int[]{};
        StdOut.println("Array is changed: "+ Arrays.toString(digitDiff(arr)));
        StdOut.println("Array: "+ Arrays.toString(test));
        
    }
}
