/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchingAlgorithms;

import LinkedList.StdOut;
import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author ad
 */
public class exponentialSearch {
    //Global Obj sc
    public static Scanner sc = new Scanner(System.in);
    
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
    
    //exponential Search
    //Time comlexity:  O(logn)
    //Auxilary space:  O(logn); because Arrays.BS use recursive to search
    //Can optimize
    
    public static int exponentialSearch1(int[] arr,int key, int lengOfArr){
        
        if(arr[0] == key){
            return 0;
        }
        
        int i = 1;
        //Find range for binary search by repeat doubling
        while(i < lengOfArr && arr[i] <= key){
            i  = i * 2;
        }
        
        //Math.min(i,leng) protects us from providing i overmore than lengthOfArr
        return Arrays.binarySearch(arr, i / 2, Math.min(i, lengOfArr), key);
    }
    
    //main
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,10};
        
        StdOut.println("Array: ");
        Print(arr);
        
        StdOut.println("Enter the element you want find: ");
        int key = sc.nextInt();
        
        int res = exponentialSearch1(arr, key, arr.length);
        if(res < 0){
            StdOut.println("Not found");
        }else{
            StdOut.println("Index of element: "+ res);
        }
    }
}
