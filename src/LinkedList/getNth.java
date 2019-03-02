
package LinkedList;

import java.util.Scanner;

/**
 *
 * @author Linh Thanh Nguyen
 */
public class getNth {
    
    //global variable
    private static int count = 0;
    
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
    
    //Function to find value of a Node at given index
    //Using recursive
    public static int getNthAtGivenIndex(Node head,int index){
        int check = 0;
        if(index > count){
            return -1;
        }
        if(check == index){
            return head.data;
        }
        return getNthAtGivenIndex(head.next, index-1);
    }
   
     //Display  values of Node of LinkedList
    public static void Print(){
        Node temp = head;
        
        while(temp != null){
        StdOut.print(temp.data+ " ");
        count++;
        temp = temp.next;
    }
        StdOut.println();
   }
    //main
    public static void main(String[] args) {
        getNth ll = new getNth();
        
        ll.push(0);
        ll.push(1);
        ll.push(2);
        ll.push(3);
        ll.push(4);
        ll.push(5);
        
        StdOut.println("Linked list: ");
        Print();
        
        Scanner sc = new Scanner(System.in);
        StdOut.println("Enter the index of Node: ");
        int value = sc.nextInt();
        
        int res =  getNthAtGivenIndex(head, value);
        if(res == -1){
            StdOut.println("Index more than length of Linked list");
        }else{
            StdOut.println("Vaue at given index: "+res);
        }
        
    }
}
