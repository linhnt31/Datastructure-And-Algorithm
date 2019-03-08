package LinkedList;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Linh Nguyen Thanh
 */

//Problem 1: Remove duplicates from an unsorted linked list
//Problem 2: Swap nodes in a linked list without swapping data

public class Practice1 {
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
    public static void Print(){
        Node temp = head;
        
        while(temp != null){
        StdOut.print(temp.data+ " ");
        len++;
        temp = temp.next;
    }
        StdOut.println();
}
    //Problem 1: Function to remove duplicates elements 
    //Time complexity: O(n)
    //Auxilary space: O(n)
    public static void removeDuplicate(){
        HashSet<Integer> hs = new HashSet<Integer>();
        Node pre = null,curr = head;
        
        if(head == null){
            StdOut.println("List is empty");
            return ;
        }
        
        while(curr != null){
            if(hs.contains(curr.data)){
                pre.next = curr.next;
                curr = curr.next;
            }else{
                hs.add(curr.data);
                pre = curr;
                curr = curr.next;
            }
        }
    }
    
    //Problem 2: Swap nodes in a linked list without swapping data
    //Fuction to swap nodes in a ll
    public static void swapNodes(int key1,int key2){
        //initial Node to track keys
        Node preX = null  , preY=  null;
        Node currX = head,currY = head;
        
        //Follow key1 by two pointers
        while(currX != null && currX.data != key1){
            preX = currX;
            currX  = currX.next;
        }
        
        //Follow key2 by two pointers
        while(currY != null && currY.data != key2){
            preY  = currY;
            currY = currY.next;
        }
        
        // If either x or y is not present, nothing to do 
        if(currX == null || currY == null){
            StdOut.println("Value doesn't exist");
            return;
        }
        
        //If key1 is head of linked list
        if(preX == null){ //make Y the new head
            head = currY;
        }else{
            preX.next = currY;
        }
        
        //If key2 is head of linked list
        if(preY != null){
            preY.next = currX;
        }else{ //make X the new head
            head = currX;
        }
        
        //Swap links of Nodes
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
        
        
    }
    //main
    public static void main(String[] args) {
        Practice1 ll = new Practice1();
        
        ll.push(1);
        ll.push(2);
        ll.push(3);
//        ll.push(3);
        ll.push(4);
        ll.push(3);
        ll.push(19);
        
        //Problem 1: 
//        StdOut.println("Before remove: ");
//        Print();
//        
//        StdOut.println("After remove: ");
//        removeDuplicate();
//        Print();

        //Problem 2: 
        StdOut.println("Before swap: ");
        Print();
        StdOut.println("Enter value of two keys: ");
        int key1 = sc.nextInt(); int key2 = sc.nextInt();
        swapNodes(key1, key2);
        StdOut.println("After swap: ");
        Print();
    }
}
