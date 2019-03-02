package LinkedList;

import java.util.Scanner;

/**
 *
 * @author Linh Nguyen Thanh
 */

//Problem: Merge 2 sorted Linked List //
public class Practice2 {
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
    //Function to merge 2 sorted lists
    //Method 1: Using dummyNode
    //Time complexity: O(headA.lengh + headB.length) --> merge sort
    //Auxilary space: O(1)
    public static Node mergeTwoSortedLists(Node headA, Node headB){
        if(headA == null && headB == null){
            StdOut.println("Lists are empty");
            return null;
        }
        
        //initialize dummyNode and tail to iterate
        Node dummyNode = new Node(Integer.MIN_VALUE);
        Node tail = dummyNode;
        
        while(true){
            if(headA == null){
                tail.next = headB;
                break;
            }
            if(headB == null){
                tail.next = headA;
                break;
            }
            //Compare value of Nodes of 2 linked lists
            if(headA.data <= headB.data){
                tail.next = headA;
                headA = headA.next;
            }else{
                tail.next = headB;
                headB = headB.next;
            }
            tail = tail.next;
        }
        return dummyNode.next;
    }
    
    //Method 2: Using recursion
    //Time complexity: O(headA.len + headB.len)
    public static Node mergeSortedListUsingRecursive(Node headA, Node headB){
        if(headA == null) return headB;
        if(headB == null) return headA;
        
        //Compare
        if(headA.data <= headB.data){
            headA.next = mergeSortedListUsingRecursive(headA.next, headB);
            return headA;
        }else{
            headB.next = mergeSortedListUsingRecursive(headA, headB.next);
            return headB;
        }
    }
    //main
    public static void main(String[] args) {
        //list 1 
        Node headA = new Node(4);
        headA.next = new Node(5);
        headA.next.next = new Node(6);
        headA.next.next.next = new Node(7);
        //list2 
        Node headB = new Node(1);
        headB.next = new Node(2);
        headB.next.next = new Node(3);
        
        StdOut.println("List 1: ");
        Print(headA);
        StdOut.println("List 2: ");
        Print(headB);
        
        StdOut.println("After merge 2 lists: ");
        //Method 1: Using dummyNode
//        Node res = mergeTwoSortedLists(headA, headB);
        //Method 2: Using recursion
        Node res = mergeSortedListUsingRecursive(headA, headB);
        Print(res);
    }
    
}
