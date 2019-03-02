package Stack;

/**
 *
 * @author Linh Nguyen Thanh
 */

// Method 1: Implement stack using array
public class implementStack {
   private int MAX_SIZE = 100;
   int top = 0;
   int[] arr = new int[MAX_SIZE];
   
   //constructor
   
   public implementStack(){
       top = -1;
   }

   boolean isEmpty() {
       return top <= 0;
    }
   
   void push(int data){
       if(top > MAX_SIZE - 1){
           StdOut.println("Stack over flow");
       }else{
           arr[++top] = data;
           StdOut.println(data+" pushed into stack");
           return;
       }
   }
   
   //peek or top are both fine
   int peek(){
       if(top < 0){
           StdOut.println("Stack underflow");
           return 0;
       }else{
           int x = arr[top--];
           return x;
       }
   }
   
}

//Method 2: Using linked list
