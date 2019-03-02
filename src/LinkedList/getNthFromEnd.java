/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

import java.util.Scanner;

/**
 *
 * @author ad
 */
public class getNthFromEnd {
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
    
    //Program for Nth from the end of Linked List
    //Step1 : Using length of the LL
    public static int getNthFromEnd(int indice, int length){
        if(indice > length || indice < 0){
            return -1;
        }
        Node temp = head;
        for(int i = 0 ; i < length-indice;i++){
            temp = temp.next;
        }
        return temp.data;
    }
    //main
    public static void main(String[] args) {
        getNthFromEnd ll = new getNthFromEnd();
        
        ll.push(0);
        ll.push(1);
        ll.push(2);
        ll.push(3);
        ll.push(4);
        ll.push(5);
        
        StdOut.println("Linked list: ");
        Print();
        
        Scanner sc = new Scanner(System.in);
        StdOut.println("Enter the indice: ");
        int indice = sc.nextInt();
        StdOut.println("Length of List: "+len);
        
        int res = getNthFromEnd(indice, len);
        if(res != -1){
            StdOut.println("Result: "+res);
        }else{
            StdOut.println("Indice not found");
        }
    }
}
