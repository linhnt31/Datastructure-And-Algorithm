package Sorting;


import Sorting.StdOut;
import static Sorting.selectionSort.implementSelectionSort;
import myArray.Array;


/**
 *
 * @author Linh Nguyen Thanh
 * 
 */
public class mergeSort {
    //Function to merge two subarrays
    public static void mergeSubarrays(int[] a, int left, int mid, int right){
        //identify 2 sizes of 2 subarrays
        int size1 = mid - left + 1;
        int size2 = right - mid;
        
        //initial 2 temp arrays
        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];
        
        //Copy data to temp array
        for(int i = 0 ; i < size1; i++){
            arr1[i] = a[i];
        }
        
        for(int j = 0; j < size2; j++){
            arr2[j] = a[mid + j + 1];
        }
        
        //initial index of 2 subarrays and merged subarray
        int i = 0, j = 0, k = 0;
        
        while( i < size1 && j < size2){
            if(arr1[i] >= arr2[j]){
                a[k] = arr2[j];
                j++;
            }else{
                a[k] = arr1[i];
                i++;
            }
            k++;
        }
        
        //Copy remaining elements of arr1[i] if any
        while(i < size1){
            a[k] = arr1[i];
            i++;
            k++;
        }
        
        //Copy remaining elements of arr2[i] if any
        while(j < size2){
            a[k] = arr1[j];
            j++;
            k++;
        }
    }
    
    
    //Function to implement merge sort
    //Merge Sort is a Divide and Conquer algorithm
    //Time complexity: O(nlogn)
    public static void implementMergeSort(int[] a, int left, int right){
        if(left <= right){
            int mid = (left + right) / 2;
            
            //sort first and second halves
            implementMergeSort(a, left, mid);
            implementMergeSort(a, mid + 1, right);
            
            //Merge 2 sorted subarrays
            mergeSubarrays(a, left, mid, right);
            
        }
    }
    
    //main
    public static void main(String[] args) {
        int[] arr = new int[5];
    
        Array a = new Array(arr);
        StdOut.println("Before sort: " + a.printArray(arr));
        
        StdOut.println("After sort: "+  a.printArray(implementSelectionSort(arr)));
    }
}
