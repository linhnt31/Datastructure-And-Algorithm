
package LinkedList;

import LinkedList.insertNode;
import LinkedList.LinkedList_1;
/**
 *
 * @author Linh Thanh Nguyen
 */
public class DeleteNode {
    //head of Linkedlist
    public static Node head ;
    //main
    public static void main(String[] args) {
        //Create a empty Linked list
        LinkedList_1 ll = new LinkedList_1();
        
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        
        Node key = new Node(2);
        deleteNode(key);
        ll.Print();
        
        
    }
    
    //Delete Node
    public static void deleteNode(Node key){
        Node preNode = null, currNode = head;
        
        if(head == null){
            return;
        }
        //if value of head Node equals key
        while( currNode.data == key.data && currNode != null){
            head = currNode.next; //head changed
        }
        
        while(currNode != null && currNode.data != key.data){
            preNode = currNode;
            currNode = currNode.next;
        }
        
        //if key isnt appear in Linkedlist
        if(currNode == null){
            StdOut.println("Not Found");
            return;
        }
        
        //Make next of currNode as next of the preNode;
        preNode.next = currNode.next;
    
}
}