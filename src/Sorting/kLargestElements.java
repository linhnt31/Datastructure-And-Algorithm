package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import myArray.Array;
/**
 *
 * @author Linh Nguyen Thanh
 */

/*
k largest(or smallest) elements in an array | added Min Heap method
Question: Write an efficient program for printing k largest elements in an array. 
Elements in array can be in any order.
For example, if given array is [1, 23, 12, 9, 30, 2, 50] 
and you are asked for the largest 3 elements i.e., k = 3 then your program should return a array


*/
public class kLargestElements {
    
    //Function to find k largest elements in a array
    //B1: Use bubbleSort for k elements
    //B2: get k last elemet --> result
    
    //Time complexity: O(k*n)
    public static int[] getKLargestElements(int[] arr, int k){
        ArrayList<Integer> arrList = new ArrayList<>();
        
        for(int i = 0 ; i < k;i++){
            for(int j = 0 ; j < arr.length-1;j++){
                if(arr[j] > arr[j + 1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        for(int i = arr.length - 1; i >= arr.length - k; i--){
            arrList.add(arr[i]);
        }
        
        return arrList.stream().mapToInt(Integer::intValue).toArray();
    }
    //main
    public static void main(String[] args) {
        int[] a = new int[6];
        Array arr = new Array(a);
        
        StdOut.println("Array: " + arr.printArray(a));
        
        StdOut.println("k largesr elements: "+ Arrays.toString(getKLargestElements(a, 3)));
    }
}
