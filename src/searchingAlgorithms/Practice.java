package searchingAlgorithms;

import java.util.Scanner;

/**
 *
 * @author Linh Nguyen Thanh
 */

//Searching a element in sorted and rotated array
public class Practice {
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
    
    
    //BinarySearch Using recursive
    public static int binarySearch(int[] arr, int low, int high, int key){
        if(low > high) return -1;
        
        int mid  = (high + low) / 2;
        
        if(arr[mid] > key) {
            return binarySearch(arr, low, mid - 1, key);
        }
        else if(arr[mid] < key) {
            return binarySearch(arr, mid + 1, high, key);
        }
        return mid;
    }
    
    
    //Function to search element in sorted and rotated array
    public static int searchElement(int[] arr, int low, int high, int key){
        if(low >  high) {
            return -1;
        }
        
        int mid = (high + low) / 2;
        
        if(arr[mid] == key){
            return mid;
        }
        
        //if arr[low : mid] sorted
        if(arr[low] <= arr[mid] ){
            if(key >= arr[low] && arr[mid] >= key){
                return binarySearch(arr, low, mid - 1, key);
            }
            return binarySearch(arr, mid + 1, high, key);
        }else{
            if(key >= arr[mid] && key <= arr[high]){
                return binarySearch(arr, mid + 1, high, key);
            }
            return binarySearch(arr, low, mid - 1, key);
        }
    }
    //main
    public static void main(String[] args) {
        //initialize array
        int[] arr = new int[7];
        initialArray(arr);
        
        StdOut.println("Array: ");
        printArray(arr);
        
        
        StdOut.println("Enter the value you want to find: ");
        int value = sc.nextInt();
        
        int element = searchElement(arr, 0, arr.length - 1, value);
        StdOut.println("Index of element: "+ element);
    }
}
