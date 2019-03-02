
package LinkedList;
/**
 *
 * @author Linh Nguyen Thanh
 */
public class removeDuplicateElements {
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
    //Function to remove duplicates in sorted list
    public static void removeDuplicate(){
        Node currNode = null,nextNode = head;
        
        while(nextNode != null && currNode != null){
            if(currNode.data == nextNode.data){
                currNode.next = nextNode.next;
                nextNode = currNode.next;
                currNode = nextNode;
            }
            else{
                currNode = currNode.next;
                nextNode = nextNode.next;
            }
        }
    }
    //main
    public static void main(String[] args) {
        removeDuplicateElements ll = new removeDuplicateElements();
        
        ll.push(1);
        ll.push(1);
        ll.push(1);
        ll.push(3);
        ll.push(7);
        
        
        StdOut.println("List is: ");
        Print();
        removeDuplicate();
        Print();
    }
}
