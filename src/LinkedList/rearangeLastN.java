package LinkedList;

import java.util.Scanner;

/**
 *
 * @author Linh Nguyen Thanh
 */
public class rearangeLastN {
    //global variable
    private static Scanner sc = new Scanner(System.in) ;
    
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

        temp = temp.next;
    }
        StdOut.println();
}
    
    //Function to reserve N last Nodes
    public static Node rearangeKNodes(Node head, int nLastNodes){
        Node temp = head , pre = null,first = head;
        
        int len = 1;
        //Calculate length of list
        while(temp.next != null){
            len++;
            temp = temp.next;
        }
        
        StdOut.println("Length of list: "+ len);
        int diff = len -nLastNodes;
        
        if(diff <= 0) return head;
        
        while(diff-- != 0){
            pre = head;
            head = head.next;
        }
        
        temp.next = first;
        
        pre.next = null;
        return head;
    }
    //main
    public static void main(String[] args) {
        rearangeLastN ll = new rearangeLastN();
        
        ll.push(5);
        ll.push(4);
        ll.push(3);
        ll.push(2);
        ll.push(1);
        
        StdOut.println("Linked list: ");
        Print(head);
        
        Node res = rearangeKNodes(head, 3);
        Print(res);
        
    }
}
