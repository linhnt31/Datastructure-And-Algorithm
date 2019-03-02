
package LinkedList;

import java.util.Scanner;

/**
 *
 * @author Linh Thanh Nguyen
 */
public class countsNumberOfTime {
    
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
    
    //Function to count number of times int occurs
    
    //method 1: traverse over the list
    //Time complexity: O(n)
    //Auxiliary space: O(1)
    public static int countNumber1(int key){
        Node temp = head;
        int count = 0;
        for(int i = 0 ; i < len ;i++){
            if(temp.data == key){
                count++;
            }
            temp = temp.next;
        }
        return count;
    }
    
    //Method 2: Using recursion
    //Time complexity: O(n)
    private static int count = 0;
    public static int countNumber2(int key,Node head){
        if(head == null){
            return count;
        }
        if(head.data == key){
            count++;
        }
        return countNumber2(key, head.next);
    }
    
    //Test
    public static int countNumber3(int key, Node head){
        if(head == null){
            return 0;
        }
        if(head.data == key){
            return 1+ countNumber3(key, head.next);
        }
        return countNumber3(key, head.next);
    }
    //main
    public static void main(String[] args) {
        countsNumberOfTime ll = new countsNumberOfTime();
         ll.push(1);
        ll.push(1);
        ll.push(2);
        ll.push(3);
        ll.push(4);
        ll.push(1);
        
        StdOut.println("Linked list: ");
        Print(); //--> call this function to count number of elements of Linked List
        
        Scanner sc = new Scanner(System.in);
        StdOut.println("Enter the key: ");
        int key = sc.nextInt();
        
        //Method 1: Traverse over the list
//        int countTimes = countNumber1(key);

        //Method 2: USing recursion
//        int countTimes = countNumber2(key, head);

        int countTimes = countNumber3(key, head);
        StdOut.println("^^ " +key+" appears "+countTimes+" times");
    }
}
