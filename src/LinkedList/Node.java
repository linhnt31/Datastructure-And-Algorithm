
package LinkedList;

/**
 *
 * @author Linh Thanh Nguyen
 */
public class Node {
    Node next;
    int data;
    String string;
    
    //constructor to create a new node
    Node(int d){
        data = d;
        next = null;
    }
    
    Node(String str){
        string = str;
        next = null;
    }
}
