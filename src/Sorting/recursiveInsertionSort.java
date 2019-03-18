package Sorting;

import static Sorting.selectionSort.implementSelectionSort;
import myArray.Array;

/**
 *
 * @author Linh Nguyen Thanh
 */
public class recursiveInsertionSort {
    //Function to implement insertion sort by recursive
    //Time complexity: 
    public static int[] recursiveInsertionSort(int[] a, int size){
        
        if(size < 1) return a;
        
        //sort first (n - 1) elements
        
        recursiveInsertionSort(a, size - 1);
        int last = a[size - 1];
        int j = size - 2;
        
        while(j >= 0 && a[j] > last){
            a[j + 1] = a[j];
            j--;
        }
        a[j + 1] = last;
         
        return a;
    }
    //main
    public static void main(String[] args) {
        int[] arr = new int[5];
    
        Array a = new Array(arr);
        StdOut.println("Before sort: " + a.printArray(arr));
        
        StdOut.println("After sort: "+  a.printArray(implementSelectionSort(arr)));
    }
}
