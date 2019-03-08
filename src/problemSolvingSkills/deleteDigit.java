package problemSolvingSkills;

import java.util.Scanner;

/**
 *
 * @author Linh Nguyen Thanh
 */

/*
Given some integer, find the maximal number you can obtain by deleting exactly one digit of the given number.

Example

For n = 152, the output should be
deleteDigit(n) = 52;
For n = 1001, the output should be
deleteDigit(n) = 101.
*/


public class deleteDigit {
    
    public static int deleteOneDigit(int n){
        int max = Integer.MIN_VALUE;
        
        for(int i = 1; i <= n; i *= 10){
            max  = Math.max(max, ((n / i)/10 + n % i));
        }
        return max;
    }
    //main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        
        int n = sc.nextInt();
        int res = deleteOneDigit(n);
        System.out.println("After delete one digit: "+ res);
    }
    
}
