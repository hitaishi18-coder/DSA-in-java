public class _4_size {
    public static void main(String[] args) {
        
        // Create a new LinkedList
        MyLinkedList ll = new MyLinkedList();

        // Add elements to linked list
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(49);
        ll.add(50);
        ll.add(100);
        
        // Print linked list
        ll.printLinkedList();

        // Print size of linked list
        System.out.println("Size of linked list = " + ll.size());
    }
}

class MyLinkedList {
    Node start; // head pointer (start of linked list)

    // Add element at the end of linked list
    void add(int val) {
        Node nd = new Node(val); // create new node
        if (start == null) {     // if list is empty
            start = nd;          // first node becomes head
        } else {
            Node t = start;      // temporary pointer
            while (t.next != null) { // traverse till last node
                t = t.next;
            }
            t.next = nd; // attach new node at end
        }
    }

    // Calculate size (number of nodes in linked list)
    int size() {
        int count = 0;     // counter
        Node t = start;    // start from head
        while (t != null) { // traverse till end
            count++;       // increment count for each node
            t = t.next;    // move to next node
        }
        return count;      // return total nodes
    }

    // Print entire linked list
    void printLinkedList() {
        Node t = start; // temporary pointer
        System.out.print("start ---> ");
        while (t != null) { // traverse nodes
            System.out.print(t.val + " ---> "); // print node value
            t = t.next; // move to next node
        }
        System.out.println("X"); // end of list
    }
}

// Node class representing each element of linked list
class Node {
    int val;   // data
    Node next; // link to next node

    Node(int val) {
        this.val = val;
        this.next = null; // next initially null
    }
}
