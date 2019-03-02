
package LinkedList;

/**
 *
 * @author Linh Thanh Nguyen
 */
public class lengthOfList {
    //global variable
    private static int len = 0;
    private static Node head; //head of Node
    
    //
    public static int length(Node temp){
        if(temp == null){
            return len;
        }
        len += 1;
        return length(temp.next);
    }
    
    //add a new node into Linked List
    public static void addFirst(int data){
        //Create a new Node
        Node newNode = new Node(data);
        
        //move pointer of newNode as head <=> first element of Linkedlist
        newNode.next = head;
        
        //move the head to point the new Node
        head = newNode;
    }
    //main
    public static void main(String[] args) {
        lengthOfList ll = new lengthOfList();
        
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(2);
        
        int leng  = length(head);
        StdOut.println("Length of Linked List: "+ leng);
        
    }
}
