package Stack;

/**
 *
 * @author Linh Nguyen Thanh
 */


public class testStack {
   //main
    public static void main(String[] args) {
        implementStack stack = new implementStack();
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        
        StdOut.println(stack.peek()+ " peeked from stack");
    }
}
