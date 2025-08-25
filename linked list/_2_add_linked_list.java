// add in first or last of the linked list 
public class _2_add_linked_list
{
    public static void main(String[] args)
    {
        // Create LinkedList object
        MyLinkedList ll = new MyLinkedList();

        // Add elements (nodes) into linked list
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        
        // Print linked list
        ll.printList();
    }
}

// Non-public LinkedList class in same file
class MyLinkedList 
{
    Node start;   // head pointer (start of the linked list)

    // Method to add element in linked list
    void add(int val)
    {
        if(isEmpty())     // First Add (if list is empty)
        {
            Node nd = new Node(val);   // create node
            start = nd;                // make it start node
            System.out.println(val+" added as first node");
        }
        else              // Add More (to the end of list)
        {
            Node t = start;
            
            // Traverse and stop at last node
            while(t.next != null)
            {
                t = t.next;
            }
            
            // Create new node
            Node nd = new Node(val);
            
            // attach next of last node to nd
            t.next = nd;
            
            System.out.println(val+" added to end of list");
        }
    }

    // Checks if linked list is empty
    boolean isEmpty()
    {
        if(start == null)
        {
            return true ;
        }
        else 
        {
            return false ;
        }
    }
    
    // Method to print linked list
    void printList()
    {
        Node t = start;
        System.out.print("start --> ");
        while(t != null)
        {
            System.out.print(t.val + " --> "); // print node value
            t = t.next;   // move to next node
        }
        System.out.println("X"); // end of list
    }
}

// Node class (represents one element of linked list)
class Node
{
    int val;   // data
    Node next; // reference to next node

    Node(int v)
    {
        val = v;
        next = null;   // initially null
    }
}
