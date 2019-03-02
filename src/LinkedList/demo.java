
package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Linh Thanh Nguyen
 */
public class demo {
    //main
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        
        ll.add("Nguyen");
        ll.add("Thanh");
        ll.add("Linh");
        
        
//        ll.addFirst("1999");
        if(ll.contains("Linh")){
            System.out.println("Exist");
        }
        
//        StdOut.println("index of Linh element: "+ll.indexOf("Linh"));
        

//..Remove
        ll.remove(0);
        Iterator<String> itr = ll.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
