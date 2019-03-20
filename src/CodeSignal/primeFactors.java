package CodeSignal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Linh Nguyen Thanh
 */

/*
Write an algorithm that constructs an array of non unique prime factors of a number n.

Example

For n = 100, the output should be
primeFactors(n) = [2, 2, 5, 5].
*/
public class primeFactors {
    
    public static int[] primeFactor(int n){
        ArrayList<Integer> arrList = new ArrayList<>();
        
        for(int i = 2; i <= n; i++){
            if(n % i == 0){
                arrList.add(i);
                n /= i;
                i--;
            }
        }
        return arrList.stream().mapToInt(Integer::intValue).toArray();
    }
    //main
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int n =sc.nextInt();
        
        StdOut.println("Array: "+ Arrays.toString(primeFactor(n)));
    }
    
}
