/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

import java.util.Scanner;

/**
 *
 * @author Linh Nguyen Thanh
 */
public class pairwiseSwapElement {
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
    
    //Method 1: Function to swap pairwise by swap data(using iterative)
    //Time complexity: O(n)
    
    public static void pairSwapWise(){
        Node temp = head;
        while(temp != null && temp.next != null){
            int tdata = temp.data;
            temp.data = temp.next.data;
            temp.next.data = tdata;
            //After swap one pair --> move temp to begin of another pair
            temp = temp.next.next;
        }
    }
    
    //Method 2: Using recursion
    public static void pairSwapWiseUsingRecursive(Node temp1){
        if(temp1 != null && temp1.next != null){
            int tdata = temp1.data;
            temp1.data = temp1.next.data;
            temp1.next.data = tdata;
             pairSwapWiseUsingRecursive(temp1.next.next);
        }
       
    }
    
    //Method 3: Function to swap pairwise without swapping data
    //Changing link of Nodes
    public static Node pairwiseSwap1(Node node){
        //If list has only 1 or 0 element--> do nothing
        if(node == null || node.next == null){
            StdOut.println("Can't swap");
            return node;
        }
        
        //Initialize pre and curr Node
        Node pre = node,curr = node.next;
        
        //Change head before proceeding
        node = curr;
        while(true){
            Node temp = curr.next;
            //make next of currenr Node as previous Node
            curr.next = pre;
            if(temp == null || temp.next == null){
                pre.next = temp;
                break;
            }
            
            pre.next = temp.next;
            
            //Update pre and curr Node
            pre = temp;
            curr = pre.next;
        }
        return node;
    }
    //main
    public static void main(String[] args) throws Exception{
        pairwiseSwapElement ll = new pairwiseSwapElement();
        
        ll.push(1);
        ll.push(2);
        ll.push(3);
        ll.push(4);
        ll.push(5);
        
        //Avoid change head pointer --> using temporily temp1 pointer
        temp1 = head;
        StdOut.println("Before swap: ");
        Print(temp1);
        
        StdOut.println("After swap: ");
//Method 1: using iterative
            //        pairSwapWise();
//Method 2: Using recursive
            pairSwapWiseUsingRecursive(temp1);
//Method 3: Swapping without swap data
           Node res =  pairwiseSwap1(head);
        Print(res);
    }
}
