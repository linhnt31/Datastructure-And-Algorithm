package LinkedList;

import java.util.Scanner;

/**
 *
 * @author Linh Nguyen Thanh
 */

//Description: rearrangeLastN
//iven a singly linked list of integers l and a non-negative integer n, move the last n list nodes to the beginning of the linked list.
//Example:
//For l = [1, 2, 3, 4, 5] and n = 3, the output should be
//rearrangeLastN(l, n) = [3, 4, 5, 1, 2];


public class Practice3 {
    //global variable
    private static Scanner sc = new Scanner(System.in) ;
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
    public static void Print(Node head){
        Node temp = head;
        
        while(temp != null){
        StdOut.print(temp.data+ " ");
        len++;
        temp = temp.next;
    }
        StdOut.println();
}
    //main
    public static void main(String[] args) {
        
    }
}
