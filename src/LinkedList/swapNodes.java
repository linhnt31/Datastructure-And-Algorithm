
package LinkedList;

/**
 *
 * @author Linh Nguyen Thanh
 */
public class swapNodes {
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
    
    //Function to swap Nodes without swap data
    public static void swapNodes(int num1,int num2){
       if (num1 == num2)
        {
            return ;
        }

        Node current = head;
        Node temp ;
        Node node1 = head;
        Node node2  = head;
        Node prevNode1 = null ;
        Node prevNode2 = null ;

        node1 = head;
        //find the first node
        while (node1 != null && node1.data != num1)
        {
            prevNode1 = node1;
            node1 = node1.next;
        }

        //find the second node
        node2 = head;
        while (node2 != null && node2.data != num2)
        {
            prevNode2 = node2;
            node2 = node2.next;
        }

        if (prevNode2.data == node1.data)
        {
            temp = node2.next;
            node2.next = node1;
            node1.next = temp;

            prevNode1.next = node2;

            return ;
        }

        if (prevNode1.data == node2.data)
        {
            temp = node1.next;
            node1.next = node2;
            node2.next = temp;

            prevNode2.next = node1;

            return ;
        }

        //swapping the actual nodes
        temp = node2.next;
        node2.next = node1.next;
        node1.next = temp;

        //swapping the previous nodes
        prevNode1.next = node2;
        prevNode2.next = node1;

        
    }
    //main
    public static void main(String[] args) {
        swapNodes ll = new swapNodes();
        
        ll.push(10);
        ll.push(1);
        ll.push(15);
        ll.push(17);
        ll.push(178);
        
        StdOut.println("Before swapping: ");
        Print();
        
        StdOut.println("After swapping: ");
        swapNodes(1, 15);
        Print();
    }
}
