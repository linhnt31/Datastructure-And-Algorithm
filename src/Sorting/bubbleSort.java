package Sorting;

import searchingAlgorithms.initialArray;

/**
 *
 * @author Linh Nguyen Thanh
 */

//Java program implementation bubble sort algorithm
public class bubbleSort {
    //Bubble Sort
    //Time complexity: O(n*n)-best cases
    public static void implementBubbleSort(int[] arr){
        int len = arr.length;
        
        for(int i = 0; i < len - 1 ;i++){
            boolean swapped = false;
            for(int j = 0;j < len - 1; j++){
                if(arr[j] >  arr[j+1]){
                     //Swap 2 elements a[i] && a[j]
                     int temp = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = temp;
                     swapped = true;
                }
            }
            //Array is sorted
            if(swapped == false){
                return ;
            }
        }
    }
    //main
    public static void main(String[] args) {
        //initialize array
        int[] arr = new int[4] ;
        initialArray a = new initialArray(arr);
        
        StdOut.println("Before sorted: " + a.Print(arr));
        
        
        //call bubbleSort
        implementBubbleSort(arr);
        StdOut.println("After sorted: " +  a.Print(arr));
        
        
    }
}
