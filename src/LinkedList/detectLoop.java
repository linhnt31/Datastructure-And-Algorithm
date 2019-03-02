/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author Linh Thanh Nguyen
 */
public class detectLoop {
    //head of Loop
    private static Node head;
    
    //Display  values of Node of LinkedList
    public static void Print(){
        Node temp = head;
        
        while(temp != null){
        StdOut.print(temp.data+ " ");
        temp = temp.next;
    }
        StdOut.println();
   }
    
    //Function to check Linked List has Loop? 
    //Floyd algorithm
    //Time complexity: O(n)
    public static boolean hasLoop(){
        Node slow = head,fast = head;
        
        if(head == null){
            return true;
        }
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    //main
    public static void main(String[] args) {
       detectLoop ll = new detectLoop();
       
       ll.head = new Node(1);
       head.next = new Node(2);
       Node myNode =  head.next.next = new Node(3);
       head.next.next.next = new Node(4);
       head.next.next.next.next= new Node(5);
       head.next.next.next.next.next = myNode;
       
       StdOut.print("Linked List: ");
//       Print();
       
       StdOut.println("Has Loop? "+ hasLoop());
    }
}
