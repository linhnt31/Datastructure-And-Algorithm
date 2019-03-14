package searchingAlgorithms;

/**
 *
 * @author Linh Nguyen Thanh
 */
/*
Find the repeating and the missing | Added 3 new methods
Given an unsorted array of size n.
Array elements are in range from 1 to n. One number from set {1, 2, …n} is missing and one number occurs twice in array.
Find these two numbers.
Examples:

  arr[] = {3, 1, 3}
  Output: 2, 3   // 2 is missing and 3 occurs twice 

  arr[] = {4, 3, 6, 2, 1, 1}
  Output: 1, 5  // 5 is missing and 1 occurs twice 
*/
public class findRepeatingMissing {
    //Method 1: O(nlogn)
    //Using sorting
    
    
    //Method 2: 
    //Time complexity: O(n
    //Space complexity: O(n)
    
    public static void findElement(int[] a){
        
        //find the repeating element
        for(int i = 0 ; i < a.length ;i++){
            int absValue = Math.abs(a[i]);
            
            if(a[absValue - 1] > 0){
                a[absValue - 1] *= -1;
            }else {
                StdOut.println("The repeating element: "+a[i] );
            }
            
        }
        
        for(int i = 0 ; i < a.length ; i++){
            if(a[i] > 0){
                StdOut.println("The missing element: "+ (i + 1));
                break;
            }
        }
    }
    
    //main
    public static void main(String[] args) {
        //initial array
        int[] arr = new int[]{1, 2, 5, 2, 4};
        
        findElement(arr);
    }
}
