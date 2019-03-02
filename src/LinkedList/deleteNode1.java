
//Delete a Node in given postion
package LinkedList;

import static LinkedList.LinkedList_1.head;
import java.util.Scanner;

/**
 *
 * @author Linh Thanh Nguyen
 */
public class deleteNode1 {
    //declare global variables
    private static int numbNode = 0;
    private static Node head; //head of Node
    
    public static void addFirst(int data){
        //Create a new Node
        Node newNode = new Node(data);
        
        //move pointer of newNode as head <=> first element of Linkedlist
        newNode.next = head;
        
        //move the head to point the new Node
        head = newNode;
    }
    //Display + count values of Node of LinkedList
    public static void Print(){
        Node temp = head;
        
        while(temp != null){
        StdOut.print(temp.data+ " ");
        numbNode++;
        temp = temp.next;
    }
        StdOut.println();
   }
    
    //Function to delete a Node at given position
    //Time complexity: O(n);
    //Auxilary Space: O(1)
    public static void deleteNode(int pos){
        if(head == null){
            StdOut.println("List is empty");
            return;
        }else if(pos == 0 && head != null){ //if head needs to be deleted
            head = head.next; //changed head
            return;
        }else if(pos > numbNode-1){ // pos more than number of Node
            StdOut.println("Pos is not exist");
            return;
        }
        
        //Node needed delete have positon >= 1
        Node preNode = null,currNode = head;
        for(int i = 0 ; i < pos;i++){
            preNode = currNode;
            currNode  = currNode.next;
        }
        
        //Make 
        preNode.next = currNode.next;
    }
    //main
    public static void main(String[] args) {
        //Create a empty List
        deleteNode1 ll = new deleteNode1();
        
        //add elements
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);
        
        //
        
        StdOut.println("Before delete: ");
        Print();
        
        StdOut.println("Number of Nodes: "+numbNode);
        Scanner sc = new Scanner(System.in);
        StdOut.println("Enter the postion: ");
        int pos = sc.nextInt();
        deleteNode(pos);
        
        StdOut.println("After delete: ");
        Print();
    }
}
