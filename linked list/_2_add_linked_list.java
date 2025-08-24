// add in first or last of the linked list 

public class _2_add_linked_list
{
    public static void main(String[] args)
    {
        MyLinkedList ll = new MyLinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        
        ll.printList();
    }
}

// Non-public class in same file
class MyLinkedList 
{
    Node start;

    void add(int val)
    {
        if(isEmpty())     // First Add
        {
            Node nd = new Node(val);
            start = nd;
            System.out.println(val+" added as first node");
        }
        else              // Add More
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
    
    void printList()
    {
        Node t = start;
        System.out.print("start --> ");
        while(t != null)
        {
            System.out.print(t.val + " --> ");
            t = t.next;
        }
        System.out.println("X");
    }
}

// Node class can also be non-public
class Node
{
    int val;
    Node next;

    Node(int v)
    {
        val = v;
        next = null;
    }
}