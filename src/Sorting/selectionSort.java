package Sorting;

import myArray.Array;

/**
 *
 * @author Linh Nguyen Thanh
 */
public class selectionSort {
    
    //Function to implement selection sort
    //TIme complexity: O(n*n)
    public static int[] implementSelectionSort(int[] a){
        for(int i = 0 ; i < a.length - 1 ; i++){
            int min_ind = i;
            for(int j = i + 1; j < a.length ; j++){
                if(a[j] < a[min_ind]){
                    min_ind = j;
                }
            }
            
            //swap the found minimum element with the first element
            int temp = a[min_ind];
            a[min_ind] = a[i];
            a[i] = temp;
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
