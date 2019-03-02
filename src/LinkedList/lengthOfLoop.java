
package LinkedList;

/**
 *
 * @author Linh Nguyen Thanh
 */
public class lengthOfLoop {
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
    
    //Function to detectLoop in Linked List
    private static Node ptr1 ; //mark location to count length of loop
    private static Node ptr2; //mark location to count length of loop
    
    public static boolean detectLoop1(){
        Node slow = head,fast = head;
        ptr1 = head;ptr2 = head;
        
        if(head == null){
            return true;
        }
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            ptr1 = fast;
            ptr2 = fast;
            
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    
    //Function to count length of number based on ptr pointer
    public static int lengthLoop(){
        
        //Bây giờ 2 con trỏ đang trỏ cùng 1 vị trí --> không chạy được loop
        ptr1 = ptr1.next;
        //đặt count = 2 vì vị trí cùng trỏ tới là lúc count = 1
        //Bây giwof ptr1 vừa next đi sẽ là 2
        int count = 2;
        if(ptr1 == null){
            return 0;
        }
        while(ptr1 != ptr2){
            count++;
            ptr1 = ptr1.next;
        }
        return count;
    }
    
    /*Optimize code :  combine 2 function */
    //Time complexity: O(n)
    //Auxilary space : O(1)
    
    //main
    public static void main(String[] args) {
        lengthOfLoop ll = new lengthOfLoop();
        
        ll.head = new Node(1);
        head.next = new Node(2);
        Node myNode = head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(5);
//        head.next.next.next.next.next.next = new Node(15); --> false
        head.next.next.next.next.next.next = myNode;
        
        StdOut.println("Has Loop: ?"+detectLoop1());
        StdOut.println("Length of the loop: "+ lengthLoop());
        
    }
}
