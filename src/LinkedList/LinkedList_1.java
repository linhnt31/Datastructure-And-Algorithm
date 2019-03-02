
package LinkedList;

/**
 *
 * @author Linh Thanh Nguyen
 */
public class LinkedList_1 {
     public static Node head; //head of Node
    
    //Add a new Node at frond of Linked List
    //Time complexity: O(1)
    public static void addFirst(int data){
        //Create a new Node
        Node newNode = new Node(data);
        
        //move pointer of newNode as head <=> first element of Linkedlist
        newNode.next = head;
        
        //move the head to point the new Node
        head = newNode;
    }
    
    //Add a new Node at the end of Linked list
    //Time complexity: O(n)
    public static void addLast(int data){
        Node temp = head;
        //Create a new Node
        Node newNode = new Node(data);
        
        if(temp == null){
            head = new Node(data);
            return;
        }
        
        while(temp.next != null){
            temp = temp.next;
        }
        
        //now : temp point to last element of Linked List
        temp.next = newNode;
        //then : new Node is last element of LL --> Null
        newNode.next = null;
    }
    
    //Add a new Node after a given Node
    //Time complexity: O(1)
    public static void addAfter(Node preNode, int data){
        //Create a new Node
        Node newNode = new Node(data);
        
       //Make next of newNode as next of preNode
       newNode.next = preNode.next;
       
       //Make preNode point to newNdoe
       preNode.next = newNode;
    }
    
    //Display value of Node of LinkedList
    public static void Print(){
        Node temp = head;
        
        while(temp != null){
        StdOut.println(temp.data);
        temp = temp.next;
    }
   }
    
    public static void main(String[] args) {
        
    }
}
