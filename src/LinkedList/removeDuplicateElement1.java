/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author ad
 */
public class removeDuplicateElement1 {
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
    public static void Print(Node head){
        Node temp = head;
        
        while(temp != null){
        StdOut.print(temp.data+ " ");
        len++;
        temp = temp.next;
    }
        StdOut.println();
}
    //Function to remove duplicate elements in unordered list
    //Method 1: Using 2 loops
    //Time complexity: O(n2)
    public static void removeDuplicateElements(){
        Node ptr1 = head,ptr2 = null;
        
        if(head == null){
            StdOut.println("Nothing");
            return;
        }
        
        //Picks elements one by one
        while(ptr1 != null && ptr1.next != null){
            ptr2 = ptr1;
            
            //Compares the picked element with rest of the elements
            while(ptr2 != null && ptr2.next != null){
                
                //sequence of steps are importand
                if(ptr2.next.data == ptr1.data){
                    ptr2.next = ptr2.next.next;
                }else{
                    ptr2 = ptr2.next;
                }
            }
            ptr1 = ptr1.next;
        }
    }
    //Method 2: Using sorting(Merger sort )
    //This method doesnt preserve the original order of elements
    //Time complexity: O(nlogn)
    //In this case, we assume List is sorted
    public static void removeDuplicateElementsUsingSorting(){
        //Sort list 
        Node currNode = head;
        if(head == null){
            StdOut.println("Do nothing");
            return;
        }
        
        while(currNode != null && currNode.next != null){
            if(currNode.data == currNode.next.data){
                currNode.next = currNode.next.next;
            }else{
                currNode = currNode.next;
            }
        }
    }
    //Method 3: Using Hashing
    //TIme complexity: O(n)
    //Auxilary spaceL O(n)
    public static void removeDuplicateElementsUsingHashSet(){
        HashSet<Integer> hs = new HashSet<>();
        Node currNode = head,pre = null;
        while(currNode != null){
            if(hs.contains(currNode.data)){
               pre.next = currNode.next;
            }else{
                hs.add(currNode.data);
                pre = currNode;
            }
            currNode = currNode.next;
        }
    }
    
    //Method 4: Using rescursion : I'm writing not true --> 
    //Time complexity: 
    
//    public static Node removeDuplicate(Node head){
//        if(head == null || head.next == null){
//            return head;
//        }
//        head.next = removeDuplicate(head.next);
//        return head.data == head.next.data ? head.next : head;
//    }
    
    //main
    public static void main(String[] args) {
        removeDuplicateElement1 ll = new removeDuplicateElement1();
        
        
        ll.push(10);
        ll.push(10);
        ll.push(15);
        ll.push(20);
        ll.push(20);
        ll.push(20);
        ll.push(10);
        ll.push(8);
        ll.push(-1);
        
        //Print
        StdOut.println("Before remove: ");
        Print(head);
        
        StdOut.println("After remove: ");
        //using method 1: 2 loops
//        removeDuplicateElements();

        //using method 2: using sorting
//        removeDuplicateElementsUsingSorting();

           //using method 3: Using hashset
//           removeDuplicateElementsUsingHashSet();
            
           //Method 4: Using recursion

       
        
    }
}
