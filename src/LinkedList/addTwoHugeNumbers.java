/*
PROBLEM: 

You're given 2 huge integers represented by linked lists. Each linked list element is a number from 0 to 9999 that represents a number with exactly 4 digits. The represented number might have leading zeros. Your task is to add up these huge integers and return the result in the same format.

Example

For a = [9876, 5432, 1999] and b = [1, 8001], the output should be
addTwoHugeNumbers(a, b) = [9876, 5434, 0].

Explanation: 987654321999 + 18001 = 987654340000.

For a = [123, 4, 5] and b = [100, 100, 100], the output should be
addTwoHugeNumbers(a, b) = [223, 104, 105].

Explanation: 12300040005 + 10001000100 = 22301040105.
*/
package LinkedList;

import java.util.Scanner;

/**
 *
 * @author Linh Nguyen Thanh
 */
public class addTwoHugeNumbers {
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
    
    //Function to add 2 huge numbers 
    public static Node addTwoHugeNumber(Node headA, Node headB){
        //initialize dummy Node
        Node dummyNode = new Node(Integer.MIN_VALUE);
        Node temp = dummyNode;
        
        //reserve 2 list to plus from rightmost-->leftmost
        headA = reserveNode(headA);
        headB = reserveNode(headB);
        
        int res = 0;
        while(headA != null || headB != null){
            if(headA != null){
                res += headA.data;
                headA = headA.next;
            }
            if(headB != null){
                res += headB.data;
                headB  = headB.next;
            }
            
            temp.next =  new Node(res % 10000);
            temp = temp.next;
            res /= 10000;
        }
        
        if(res >= 1){
            temp.next = new Node(res);
        }
        return reserveNode(dummyNode.next);
    }
    
    //Function to reserve list
    public static Node reserveNode(Node h){
        Node pre = null, curr = h,next = h;
        while(curr != null){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }
    //main
    public static void main(String[] args) {
       //For a = [9876, 5432, 1999] and b = [1, 8001]
       
       Node head1 = new Node(9876);
       head1.next  = new Node(5432);
       head1.next.next = new Node(1999);
       
       Node head2 = new Node(1);
       head2.next  = new Node(8001);
      
       
       Node res = addTwoHugeNumber(head1, head2);
        Print(res);
    }
}
