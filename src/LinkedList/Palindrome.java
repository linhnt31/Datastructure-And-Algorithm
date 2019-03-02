
package LinkedList;

/**
 *
 * @author Linh Nguyen Thanh
 */
public class Palindrome {
    //global variable
    private static int len = 0;
    
     public static Node head; //head of Node

      //push a new element to List
    public static void push(String data){
        //Create a new Node
        Node newNode = new Node(data);
        
        //move pointer of newNode as head <=> first element of Linkedlist
        newNode.next = head;
        
        //move the head to point the new Node
        head = newNode;
    }
    
    //Display  values of Node of LinkedList
    public static void Print(){
        Node temp = head;
        
        while(temp != null){
        StdOut.print(temp.string+ " ");
        len++;
        temp = temp.next;
    }
        StdOut.println();
} 
    
    //Function to reserve a list
    public static Node reserveList(Node n){
        Node pre = null,curr = n, next = null;
        
        while(curr != null){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        n = pre;
        return n;
    }
    
    //Function to check List is palindrome
    //Method 1:  reserve List
    //Time complexity: O(n)
    //Auxilary space: O(1)
    public static boolean isPalindrome(){
        Node slow = head,fast = head;
        
        //fint middle element
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        //Make slow as the head of second half
        slow = reserveList(slow);
        
        while(slow != null){
            if(!slow.string.equals(head.string)){
                return false;
            }
            
            slow = slow.next;
            head = head.next;
        }
        return true;
    }
    
    //Method 2: Using stack
    
    //Method 3: Using recursion
    
    //main
    public static void main(String[] args) {
        //Create a empty list
        Palindrome ll = new Palindrome();
        
        ll.push("A");
        ll.push("B");
        ll.push("C");
        ll.push("C");
        ll.push("B");
        ll.push("A");
        
        StdOut.println("Linked list: ");
        Print();
        
        StdOut.println("is Palindrome ?"+ isPalindrome());
    }
}
