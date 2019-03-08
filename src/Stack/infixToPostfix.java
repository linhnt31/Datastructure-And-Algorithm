package Stack;

import java.util.Arrays;
import java.util.Stack;

/**
 *
 * @author Linh Nguyen Thanh
 */
public class infixToPostfix {
    
    //Function to check priority
    public static int priority(char c){
        switch(c){
            case '+':
            case '-':
                return 1;
            
            case '*':
            case '/':
                return 2;
            
            case '^':
                return 3;
        }
        return 0;
    }
    
    
    //Function to check operator
    public static boolean checkCharacter(char c){
        Character[] op = {'+', '-','*', '/','^','(',')'};
        Arrays.sort(op);
        if(Arrays.binarySearch(op, c) > -1){
            return true;
        }
        return false;
    }
    
    //Function to convert infix to postfix expression
    public static String infixToPostFix1(String infix){
        StringBuilder res  = new StringBuilder();
        Stack<Character> stack = new Stack<Character>();
        
        for(int i = 0 ; i < infix.length();i++){
            char c = infix.charAt(i);
            
            if(!checkCharacter(c)){
                res.append(c);
            }
            
            else if(c == '('){
                stack.push(c);
            }
            
            else if(c == ')'){
                while(!stack.isEmpty() && stack.peek() != '('){
                    res.append(stack.pop());
                }
                if(!stack.isEmpty()){
                    stack.pop();
                }
          
            }
            
            else{
                while(!stack.isEmpty() && priority(c) <= stack.peek() && stack.peek() != '('){
                    res.append(stack.pop());
                }
                
                stack.push(c);
            }
        }
        
        //append rest of stack to string res
        while(!stack.isEmpty() ){
            res.append(stack.pop());
        }
        return res.toString();
    }
    //main
    public static void main(String[] args) {
        String s = "x+y*z";

        StdOut.println("Infix: "+ s);
        String res = infixToPostFix1(s);
        StdOut.println("Postfix: "+ res);
        
    }
    
}
