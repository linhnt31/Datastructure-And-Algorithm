
package LinkedList;

/**
 *
 * @author Linh Thanh Nguyen
 */
public class printMiddle {
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
    
    //Find middle element 
    //Method 1: Using length
    public static int printMiddle1(){
        //if List is empty
        if(head == null){
            return -1;
        }
        Node temp = head;
        
        //Space between temp and mid element
        int spc = len / 2;
        for(int i = 0 ; i < spc;i++){
            temp = temp.next;
        }
        return temp.data;
    }
    
    //Method 2: USing 2 pointers
    public static int printMiddle2(){
        //if List is empty
        if(head == null){
            return -1;
        }
        Node slow = head,fast =  head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
    //main
    public static void main(String[] args) throws Exception {
        printMiddle ll = new printMiddle();
        
//        ll.push(6);
//        ll.push(6);
//        ll.push(1);
//        ll.push(2);
//        ll.push(4);
//        ll.push(4);
        
        
        StdOut.print("Linked List: ");
        Print();
        
//        Method 1: USing length of LL
//        int midElement = printMiddle1();

        //Method 2: Using 2 pointers
        int midElement = printMiddle2();
        if(midElement == -1){
            StdOut.println("List is empty");
        }else{
            StdOut.println("Middle element: "+midElement);
        }
    }
}
