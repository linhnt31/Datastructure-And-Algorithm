package searchingAlgorithms;

import java.util.Scanner;

/**
 *
 * @author Linh Nguyen Thanh
 */
/*
--Problem: 
Search an element in a sorted and rotated array
An element in a sorted array can be found in O(log n) time via binary search.
But suppose we rotate an ascending order sorted array at some pivot unknown to you beforehand. 
So for instance, 1 2 3 4 5 might become 3 4 5 1 2. 
Devise a way to find an element in the rotated array in O(log n) time.

*/
public class sortedRotatedArray {
    //obj global
    public static Scanner sc = new Scanner(System.in);
    
    //Enter elements of array
    public static void initialArray(int[] a){
        StdOut.println("Enter value of array: ");
        for(int i = 0 ; i < a.length;i++){
            a[i] = sc.nextInt();
        }
    }
    
    
     //Function to print array
    public static void Print(int[] a){
        for(int i = 0 ; i < a.length;i++){
            StdOut.print(a[i] + "  ");
        }
        StdOut.println();
    }
    
    
    //Binary Search without recursive 
    //Time complexity: O(nlogn)
    public static int binarySearch1(int[] arr , int key){
        int left = 0, right = arr.length-1;
        
        while(left <= right){
            int mid = (left + right) / 2;
            
            if(arr[mid] == key){
                return mid;
            }else if(arr[mid] > key){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        
        return -1; //not found 
    }
    
    
    public static int binarySearch2(int[] arr, int low, int high, int key){
        if(low > high) return -1;
        if(low == high) return low;
        
        int mid = (high + low) / 2;
        
        if(arr[mid] == key){
            return mid;
        }else if(arr[mid] > key){
            return binarySearch2(arr, low, mid - 1, key);
        }
        return binarySearch2(arr, mid + 1, high, key);
    }
    
    
    //Function to search pivot
    //Example: 3 4 5 1 2 --> 5 is pivot
    public static int findPivot(int a[], int low, int high){
        
        if(low >= high) return -1;
        
        int mid = (high - low) / 2;
        
        if(a[mid] > a[mid + 1] && mid < high ){
            return mid;
        }
        if(a[mid] < a[mid - 1] && mid > low){
            return mid - 1;
        }
        if(a[low] >= a[mid]){
            return findPivot(a, low, mid-1);
        }
        return findPivot(a, mid + 1, high);
        
    }
    
    
    //Method 1: Function to find index of given element
    public static int indexOfElementFinded(int[] arr, int high, int key){
        int indexOfpivot = findPivot(arr, 0, arr.length-1);
        
        //array is sorted. Assume array is increasing
        if(indexOfpivot == -1){
            return binarySearch2(arr, 0, arr.length - 1, key);
        }
        
        if(arr[indexOfpivot] == key){
            return indexOfpivot;
        }
        else if(arr[0] > key){
            return binarySearch2(arr, indexOfpivot+1, arr.length-1, key);
        }
        return binarySearch2(arr, 0, indexOfpivot - 1, key);
    }
    
    
    //Method 2: Improving method 1
    /* Java program to search an element in  
   sorted and rotated array using 
   single pass of Binary Search*/
    
    public static int improvingSearch(int[] arr, int low, int high,int key){
        if(low > high) return -1;
       
        int mid = (low + high) / 2;
        if(arr[mid] == key){
            return mid;
        }
        
        //if arr[low : mid ] is sorted
        if(arr[low] <= arr[mid]){
            if(key >= arr[low] && key  <= arr[mid]){
                return binarySearch2(arr, low, mid - 1, key);
            }
            return  binarySearch2(arr, mid + 1, high, key);
        }
        
        else {
            if(key >= arr[mid] && key <= arr[high]){
                return binarySearch2(arr, mid + 1, high, key);
            }
            return binarySearch2(arr, low, mid - 1, key);
        }
    }
    //main
    public static void main(String[] args) {
        //initialize new array
        int[] arr = new int[6];
        initialArray(arr);
        StdOut.println("Array: ");
        Print(arr);
        
//        int pivot = findPivot(arr, 0, arr.length);
//        StdOut.println("index of pivot element: "+ pivot);
        
        StdOut.println("Enter the value you want to find: ");
        int key = sc.nextInt();
        
        //Method 1:
//        int index = indexOfElementFinded(arr, arr.length, key);
        
        //Method 2: 
        int index = improvingSearch(arr, 0, arr.length, key);
        StdOut.println("Index of key is: "+ index);
    }
    
        
}
