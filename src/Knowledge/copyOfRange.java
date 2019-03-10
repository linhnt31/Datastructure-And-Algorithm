package Knowledge;

import java.util.Arrays;

/**
 *
 * @author Linh Nguyen Thanh
 */
public class copyOfRange {
    //main
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3};
        
        System.out.println("Original array: ");
        for(int x: arr){
            System.out.print(x + " ");
        }
        System.out.println("\n");
        
        int[] copyArr = Arrays.copyOfRange(arr, 0, 4);
        System.out.println("Array copied: ");
         for(int x: copyArr){
            System.out.print(x + " ");
        }
    }
}
