package Stack;

import java.util.Arrays;

/**
 *
 * @author Linh Nguyen Thanh
 */

/*Implements 2 stacks in an array*/
public class twoStacks {
    //Global variables
    int size; // size of array
    int top1, top2;     
    public static int arr[];
    
    //constructor
    public twoStacks(int sizeOfArray) {    
        size = sizeOfArray;
        arr = new int[sizeOfArray];
        top1 = -1;
        top2 = sizeOfArray;
    }
    
    
    //Method to push elements to Stack1
    private void push1(int x){
        //There is at least one empty space for new element
        if(top1 < top2 - 1){
            top1++;
            arr[top1] = x;
        }else{
            StdOut.println("Stack over flow");
            return;
        }
    }
    
    
    //Method to push elements to Stack2
    private void push2(int x){
        //There is at least one empty space for new element
        if(top1 < top2 - 1){
            top2--;
            arr[top2] = x;
        }else{
            StdOut.println("Stack over flow");
            return;
        }
    }
    
    
    //Method to pop an element from first stack
    private int pop1(){
        if(top1 >= 0){
            int res = arr[top1];
            top1--;
            return res;
        }else{
            StdOut.println("Stack UnderFlow");
        }
        return 0;
    }
    
    
    //Method to pop an element from second stack
    private int pop2(){
        if(top2 < size){
            int res = arr[top2];
            top2++;
            return res;
        }else{
            StdOut.println("Stack UnderFlow");
        }
        return 0;
    }
    //main
    public static void main(String[] args) {
        //initialize Stack
        twoStacks stack = new twoStacks(5);
        
        stack.push1(1);
        stack.push2(2);
        stack.push2(3);
        stack.push1(4);
        stack.push1(5);
        
        StdOut.println("Element poped from Stack1: "+ stack.pop1());
        StdOut.println("Element poped from Stack2: "+ stack.pop2());
        
        StdOut.println("Array: "+ Arrays.toString(arr));
    }
}
