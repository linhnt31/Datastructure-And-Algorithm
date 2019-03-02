package LinkedList;

/**
 *
 * @author Linh Nguyen Thanh
 */
public class reserveInGroups {
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
      public static void Print1(Node head){
        Node temp = head;
        
        while(temp != null){
        StdOut.print(temp.data+ " ");
        len++;
        temp = temp.next;
    }
        StdOut.println();
}
    //function to reserve a linked list in groups of given size k
      //Method 1:  k * O(n/k) -- > O (n)
    public static Node reserveLLInGroups(Node head,int k){
        Node pre = null, curr  = head, next = null, temp = null;
        int count = 0, check = 0;
        
        //reserve a sublist
        while(count < k && curr != null ){
            next = curr.next;
            temp = next;
            curr.next =pre;
            pre = curr;
            curr = next;
            count++;
        }
        
        
        while(temp != null){
            check++;
            temp = temp.next;
        }
        //Now next points (k+1)thNode
        if(next != null && check >= k){
            head.next = reserveLLInGroups(next, k);
        }
        
        if(next != null && check < k){
            head.next = next;
        }
        //pre is head of input
        return pre;
    }
    
    //Method 2: may be more simple than method 1 ^^
    
    //main
    public static void main(String[] args) {
        reserveInGroups ll = new reserveInGroups();
        
        ll.push(7);
        ll.push(6);
        ll.push(5);
        ll.push(4);
        ll.push(3);
        ll.push(2);
        ll.push(1);
        
        StdOut.println("Before reserve: ");
        Print();
        
        StdOut.println("value of head: " + head.data);
        
        Node res = reserveLLInGroups(head, 3);
        
        StdOut.println(res.data);
        StdOut.println("head: "+ head.data);
        Print1(res);
    }
}
