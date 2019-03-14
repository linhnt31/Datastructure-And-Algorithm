package searchingAlgorithms;

import java.util.Scanner;
import myArray.Array;

/**
 *
 * @author Linh Nguyen Thanh
 */

/*
Count number of occurrences (or frequency) in a sorted array
Given a sorted array arr[] and a number x, write a function that counts the occurrences of x in arr[].
Expected time complexity is O(Logn)
Examples:

  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 2
  Output: 4 // x (or 2) occurs 4 times in arr[]

  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 3
  Output: 1 

  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 1
  Output: 2 

  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 4
  Output: -1 // 4 doesn't occur in arr[] 
*/
public class countNumberOfOccurences {
    
    //BinarySearch
    public static int binarySearch(int[] a, int left, int right, int key){
        if(left > right) return -1;
        
        int mid = (left + right) / 2;
        
        if(a[mid] == key) return mid;
        
        if(a[mid] > key) return binarySearch(a, left, mid - 1, key);
        
        return binarySearch(a, mid + 1, right, key);
    }
    
    
    //Mehtod 1: Using binary Search
    //Time complexity: O(logn + count)
    //Solution:We first find an occurrence using binary search. 
//    Then we match toward left and right sides of the matched the found index.
    
    public static int countOccurences1(int[] a,int left, int right, int key){
        //first an occurence
        int ind = binarySearch(a, left, right, key);
        
        //not emerge
        if(ind == -1) return -1;
        
        int count = 1;
        
        //left
        left = ind - 1;
        while(left >= 0 && a[left] == key){
            count++;
            left--;
        }
        
        //right
        right = ind + 1;
        while(right < a.length && a[right] == key){
            count++;
            right++;
        }
        
        return count;
    }
    
    
    ///Method 2: 
    //Time complexity: O(logn)
    //Solution: 
//1) Use Binary search to get index of the first occurrence of x in arr[]. Let the index of the first occurrence be i.
//2) Use Binary search to get index of the last occurrence of x in arr[]. Let the index of the last occurrence be j.
//3) Return (j – i + 1);
    
    //Function to get index of the first occurence
    public static int firstOccurence(int[] a, int left, int right, int key){
        if(left <= right){
            
            int mid = (left + right) / 2;
            
            if((mid == 0 || key > a[mid - 1]) && a[mid] == key){
                return mid;
            }
            
            else if (a[mid] > key){
                return firstOccurence(a, left, mid - 1, key);
            }
            return firstOccurence(a, mid + 1, right, key);
        }
        return -1;
    }
    
    
    //Function to get index of the last occurence
    public static int lastOccurence(int[] a, int left, int right, int key){
        if(left <= right){
            
            int mid = (left + right) / 2;
            
            if((mid == a.length - 1 || key < a[mid + 1]) && a[mid] == key){
                return mid;
            }
            else if(a[mid] > key){
                return lastOccurence(a, left, mid - 1, key);
            }
            return lastOccurence(a, mid + 1, right, key);
        }
        return -1;
    }
    
    
    //Function to count number of occurences by best Binary Search
    public static int countOccurencesOtimized(int[] a, int left , int right, int key){
        int first = firstOccurence(a, left, right, key);
        int last = lastOccurence(a, left, right, key);
        
        if(first == -1) return 0;
        if(first == last && first != -1) return 1;
        
        return last - first + 1;
        
    }
    
    
    //main
    public static void main(String[] args) {
        int[] a = new int[]{1,2,2,2,2,3};
        
//        Array arr = new Array(a);
//        StdOut.println("My array: "+ arr.printArray(a));
        
        Scanner sc =  new Scanner(System.in);
        StdOut.println("Enter the key: ");
        int key = sc.nextInt();
        
//        int res = countOccurences1(a, 0, a.length-1, key);
        
        int res = countOccurencesOtimized(a, 0 , a.length - 1, key);
        StdOut.println(key + " appears " +res + " times" );
    }
}
