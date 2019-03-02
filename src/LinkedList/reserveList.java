
package LinkedList;

/**
 *
 * @author Linh Thanh Nguyen
 */
public class reserveList {
    //global variable
    private static int len = 0;
    
     public static Node head; //head of Node

      //push a new element to List
    public static void push(int data){
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
        StdOut.print(temp.data+ " ");
        len++;
        temp = temp.next;
    }
        StdOut.println();
}
    //Function to reserve a List
    public static void reserveLL(){
        Node pre = null, curr = head,next = null;
        while(curr != null){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        head  = pre;
    }
    //main
    public static void main(String[] args) {
        reserveList ll = new reserveList();
        
        ll.push(0);
        ll.push(1);
        ll.push(5);
        ll.push(3);
        ll.push(8);
        ll.push(7);
        
        StdOut.println("Linked List: ");
        Print();
        
        StdOut.println("After reserve LL: ");
        reserveLL();
        Print();
    }
}
