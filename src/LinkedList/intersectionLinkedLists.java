//Write a program to find the node at which the intersection of two singly linked lists begins.


package LinkedList;

import java.util.Scanner;

/**
 *
 * @author Linh Nguyen Thanh
 */
public class intersectionLinkedLists {
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
    
    //Function to find intersection of two linked lists
    public static Node intersectionOfTwoLists(Node headA, Node headB){
        Node temp1 = headA;
        Node temp2 = headB;
        
        while(temp1 != temp2){
            temp1 = temp1 == null ? headB : temp1.next;
            temp2 = temp2 == null ? headA : temp2.next;
        }
        return temp1;
    }
    //main
    public static void main(String[] args) {
        //List 1:
        Node headA = new Node(1);
        headA.next = new Node(2);
        headA.next.next = new Node(4);
        Node inter = headA.next.next.next = new Node(8);
        headA.next.next.next.next = new Node(10);
        
        
        //List 2: 
        Node headB = new Node(1);
        headB.next = new Node(7);
        headB.next.next = inter;
        
        
        //Display
        StdOut.println("List 1: ");
        Print(headA);
        
        StdOut.println("List 2: ");
        Print(headB);
        
        StdOut.println("test: "+ headA);
        StdOut.println("test: "+ headB);
        Node res = intersectionOfTwoLists(headA, headB);
        StdOut.println("Node between 2 linked lists: "+ res.data);
        
        
    }
}
