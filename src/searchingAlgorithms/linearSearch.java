
//Problem: Given an array arr[] of n elements, write a function to search a given element x in arr[].
//Return its index

package searchingAlgorithms;

import LinkedList.StdOut;
import java.util.Scanner;

/**
 *
 * @author Linh Nguyen Thanh
 */
public class linearSearch {
    //Linear Search
    //Time complexity: O(n)
    public static int linearSearch(int[] a,int key){
        int index = -1;
        for(int i = 0 ; i < a.length;i++){
            if(a[i] == key){
                index = i;
                break;
            }
        }
        return index;
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
        Scanner sc = new Scanner(System.in);
        
        StdOut.print("Enter length of array: ");
        int n  = sc.nextInt();
        
        int[] a = new int[n];
        
        //Enter input for array
        for(int i = 0 ; i < a.length;i++){
            a[i] = sc.nextInt();
        }
        
        //Print
        StdOut.println("Array : ");
        Print(a);
        
        StdOut.println("Enter the element yout want find: ");
        int key = sc.nextInt();
        
        int res = linearSearch(a, key);
        if(res == -1){
            StdOut.println("Not found");
        }else{
            StdOut.println("Index of element: "+ res);
        }
    }
}
