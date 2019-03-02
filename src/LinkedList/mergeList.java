
package LinkedList;

//Merge two sorted linked lists
import java.util.Scanner;

/**
 *
 * @author Linh Nguyen Thanh
 */
public class mergeList {
     //global variable
    private static Scanner sc = new Scanner(System.in) ;
    private static int len = 0;
    
     public static Node head; //head of Node
     private static Node temp1;
      //push a new element to List
    public static void push(int data){
        //Create a new Node
        Node newNode = new Node(data);
        
        //move pointer of newNode as head <=> first element of Linkedlist
        newNode.next = head;
        
        //move the head to point the new Node
        head = newNode;
    }
    
    /* Method to insert a node at  
   the end of the linked list */
    public static void addToTheLast(Node node){
        if(head == null){
            head  = node;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }
    
    //Display  values of Node of LinkedList
    public static void Print(Node head){
        Node temp = head;
        
        while(temp != null){
        StdOut.print(temp.data+ " ");
        len++;
        temp = temp.next;
    }
        StdOut.println();
}
    //Function to merges 2 list sorted
    //Method 1: 
    //Time complexiqty: O(LL1.length + LL2.length)
    public static Node mergeSortedList(Node headA, Node headB){
        //initialize dummy Node
        Node dummy = new Node(0);
        Node tail = dummy;
        
        while(true){
            /* if either list runs out,  
        use the other list */
            if(headA == null){
                tail.next = headB;
                break;
            }
            if(headB == null){
                tail.next = headA;
                break;
            }
            
            if(headA.data <= headB.data){
                tail.next = headA;
                headA = headA.next;
            }else{
                tail.next =  headB;
                headB = headB.next;
            }
            //Advance the tail
            tail = tail.next;
        }
        return dummy.next;
    }
    
    //Method 2: Using recursion
    public static Node mergeListusingRecursion(Node headA, Node headB){
        //Stop points
        if(headA == null) return headB;
        if(headB == null) return headA;
        
        if(headA.data <= headB.data){
            headA.next = mergeListusingRecursion(headA.next, headB);
            return headA;
        }else{
            headB.next = mergeListusingRecursion(headA, headB.next);
            return headB;
        }
    }
    //main
    public static void main(String[] args) {
        mergeList ll1 = new mergeList();
        mergeList ll2 = new mergeList();
        
        Node head1 = new Node(8);
        head1.next = new Node(10);
        head1.next.next = new Node(15);
        
        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);
        
        //Method 1: Using dummy Node
//        Node res = mergeSortedList(head1, head2);
        
        //Method 2: Using recursion
        Node res = mergeListusingRecursion(head1, head2);
        StdOut.println("After merge 2 lists: ");
        Print(res);
        
    }
}
