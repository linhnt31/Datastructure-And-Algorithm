
//Search an element in LinkedList by iteration and recursive
//have a problem about a Node isnt exist in LinkedLiist

package LinkedList;

import java.util.Scanner;

/**
 *
 * @author Linh Thanh Nguyen
 */
public class searchANode {
    
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
    
    //use recursive to find Node
    public static boolean searchElement(int temp,Node head){
        // if key presents in Linked list
        if(head.data == temp){
            return true;
        }
        if(head == null){
            return false;
        }
        return searchElement(temp,head.next);
    }
    
     //Display  values of Node of LinkedList
    public static void Print(){
        Node temp = head;
        
        while(temp != null){
        StdOut.print(temp.data+ " ");
        temp = temp.next;
    }
        StdOut.println();
   }
    //main
    public static void main(String[] args) {
        searchANode ll = new searchANode();
        
        ll.push(6);
        ll.push(1);
        ll.push(2);
        ll.push(4);
        
        
        StdOut.println("Linked List: ");
        Print();
        Scanner sc = new Scanner(System.in);
        StdOut.println("Enter a value of Node to find: ");
        int key = sc.nextInt();
        boolean res = ll.searchElement(key, head);
        if(res){
            StdOut.println("Node is exist");
        }else{
            StdOut.println("Can't find");
        }
    }
}
