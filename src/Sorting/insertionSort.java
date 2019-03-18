package Sorting;

import static Sorting.selectionSort.implementSelectionSort;
import myArray.Array;

/**
 *
 * @author Linh Nguyen Thanh
 */
public class insertionSort {
    
    //Function to implement insertion Sort
    //TIme complexity: O(n*n)
    public static int[] implementInsertionSort(int[] a){
        
        for(int i = 1 ; i < a.length ;i++){
            int j = i - 1;
            int temp = a[i];
            
            while(j >= 0){
                if(temp < a[j]){
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
                i = j;
                j--;
            }
        }
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
