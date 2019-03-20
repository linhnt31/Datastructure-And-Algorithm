/*
 * DataStructure and Algorithm
 * 2019
 */
package Sorting;

import myArray.Array;

/**
 *
 * @author Linh Nguyen Thanh
 */
public class quickSort {
    
    public static int partition(int[] arr, int begin, int end){
        int pivot  = arr[end];
        int i = begin - 1;
        
        for(int j = begin ; j < end ; j++){
            if(arr[j] <= pivot){
                i++;
                
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        
        int tmp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end]  = tmp;
        
        return i + 1;
    }
    //Function to implement Quick sort 
    //Time complexity: O(nlogn)
    //Space complexity: O(1)
    public static void QuickSort(int[] arr, int begin, int end){
        if(begin < end){
            int partitionIndex = partition(arr, begin, end);
            
            QuickSort(arr, begin, partitionIndex - 1);
            QuickSort(arr, partitionIndex + 1, end);
        }
    }
    
    //main
    public static void main(String[] args) {
         int[] arr = new int[5];
    
        Array a = new Array(arr);
        StdOut.println("Before sort: " + a.printArray(arr));
        
        
        QuickSort(arr, 0, arr.length - 1);
        StdOut.println("After sort: "+  a.printArray(arr));
    }
}
