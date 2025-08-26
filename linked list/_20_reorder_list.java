
import java.util.ArrayDeque;

public class _20_reorder_list {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        // Add elements to LinkedList
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        
        // Reorder the linked list
        reorderList(ll.start);
        
        // Print final reordered list
        printList(ll.start);

    }

    public static void reorderList(Node start)
    {
        // use deque to store all nodes value 

        ArrayDeque<Integer> dq = new ArrayDeque<>();

        Node t = start ;

        // transverse list and put all value into deque

        while (t != null) { 
            dq.add(t.val);
            t = t.next;
        }
        System.out.println(dq);

        int val ;
        // again traverse the linked list and pverwrite values 

        // take values alternately from front and back of deque

        t = start;

        while (true) { 
            // Take element from front

            val = dq.removeFirst();
            System.out.println(val);

             // Update current node value

             t.val = val;
             t = t.next;

            // Stop if deque becomes empty

            if(dq.isEmpty())
            {
                break;
            }

            // Take element from back
            val = dq.removeLast();
            System.out.println(val);

             // Update current node value

             t.val = val;
             t = t.next;

             // stop if deque becomes empty 

             if(dq.isEmpty())

             {
                break;
             }
        }
    }

      static void printList(Node start)
    {
         // Print the linked list in standard format
         Node t = start;
         
         System.out.print("start -->");
         while(t!=null)
         {
             System.out.print(t.val+" --> ");
             t = t.next;
         }
         System.out.println("X");

        }

    }
