
package searchingAlgorithms;

import LinkedList.StdOut;
import java.util.Scanner;

/**
 *
 * @author Linh Nguyen Thanh
 */
public class binarySearch {
    //Global Obj sc
    public static Scanner sc = new Scanner(System.in);
    
    //Binary Search : Standard
    //Time complexity: O(n)
    public static int binarySearch(int[] arr,int key){
        int left  = 0, right = arr.length-1;
        int res = -1;
        
        while(left <= right){
            int mid = left + (right-left)/2;
            
            // If element is smaller than mid, then 
            // it can only be present in left subarray 
            if(arr[mid] > key){
                right = mid - 1;
            }
            // Else the element can only be present 
            // in right subarray 
            else if(arr[mid] < key){
                left = mid+1;
            }else{
                res = mid;
                break;
            }
        }
        return res;
    }
    
    //BinarySearch: Using recursion
    // Auxilary space: O(logn)
    public static int binarySearchRecursion(int left,int right,int[] arr,int key){
        int mid = left + (right-left)/2;
        
        //stop point
        if(left > right){
            return -1;
        }
      
        if(arr[mid] > key) return binarySearchRecursion(left, mid-1, arr, key);
        else if(arr[mid] < key) return binarySearchRecursion(mid+1, right, arr, key);
        return  mid;
        
    }
    //Enter the input
    public static void input(int[] a){
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
    //main
    public static void main(String[] args) {
        //sorted array
        int[] arr = {1 ,2 ,4 ,6 ,8, 12};
        
         
        StdOut.println("Array: ");
        Print(arr);
        
        StdOut.println("Enter the value you want find: ");
        int key = sc.nextInt();
       
        //
        //Using binary standard
//        int res = binarySearch(arr, key);

        //Using recursion
        int res = binarySearchRecursion(0, arr.length-1, arr, key);
        if(res == -1){
            StdOut.println("Not found");
        }else{
            StdOut.println("Index of element: "+res);
        }
    }
}
