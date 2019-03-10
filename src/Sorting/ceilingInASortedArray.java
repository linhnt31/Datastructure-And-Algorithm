/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

import myArray.Array;

/**
 *
 * @author silverbullet
 */

/* Problem: 
Ceiling in a sorted array
Given a sorted array and a value x, the ceiling of x is the smallest element in array greater than or equal to x,
and the floor is the greatest element smaller than or equal to x. Assume than the array is sorted in non-decreasing order.
Write efficient functions to find floor and ceiling of x.

*/
public class ceilingInASortedArray {
    //Function to find ceil + floor of given key
    //Method 1: Linear Search
    //time complexity: O(n)
    public static String getCeilFloor1(int[] a, int key){
        if(a[0] >= key){
            return "Ceil: " + a[0] + " and Floor doesnt exist"; 
        }else if(a[a.length-1] <= key){
            return "Floor: " + a[a.length-1] + " and Ceil doesnt exist";
        }
        
        for(int i = 1 ; i  < a.length-1;i++){
            if(a[i] <= key && a[i+1] >= key){
                return "Floor: "+ a[i]+ " and Ceil: "+ a[i+1];
            }
        }
        return "Floor anf ceil doesnt exist";
    }
    
    
    //method 2; Using binarySearch
    public static String ceilBinarySearch(int[] a, int left, int right, int key){
        if(key > a[right]) {
            return "Ceil isnt exist";
        }
        if(key <= a[left]){
            return "Ceil: " + a[left];
        }
        
        
        int mid = (left + right) / 2;
        
        
        if(a[mid] == key){
            return "Ceil: "+ a[mid];
        }
        else if(a[mid] > key){
            if(mid - 1 >= left && a[mid - 1] < key){
                return "Ceil: "+ a[mid];
            }
            else if(mid - 1 >= left && a[mid - 1] >= key){
                return "Ceil: "+ a[mid-1]; 
            } 
            return ceilBinarySearch(a, left, mid - 1, key);
        }else{
            if(mid + 1 <= right && a[mid + 1] < key){
                return  "Ceil: " + a[mid];
            }
            else if(mid + 1 <= right && a[mid + 1] >= key){
                return  "Ceil: " + a[mid + 1];
            }
            return ceilBinarySearch(a, mid + 1, right, key);
        }
    }
    
    //main
    public static void main(String[] args) {
        int[] a = new int[6];
        Array arr = new Array(a);
        
        StdOut.println("Array: " + arr.printArray(a));
        //Method 1: Using LinearSearch
//        StdOut.println(getCeilFloor1(a, 0));
        
        //Method 2: 
        StdOut.println(ceilBinarySearch(a, 0, a.length-1, 1));
    }
}
