public class _3_add_first {
    public static void main(String[] args) {
        // Create linked list object
        MyLinkedList ll = new MyLinkedList();

        // Add elements at the end
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);

        // Add element at the beginning
        ll.addFirst(100);
        
        // Print linked list
        ll.printList();
    }
}   

class MyLinkedList {
    Node start; // head pointer (beginning of list)

    // Add at end of linked list
    void add(int val) {
        Node nd = new Node(val); // create a new node

        if (start == null) { // if list is empty
            start = nd;      // first node becomes start
        } else {
            Node t = start;  // temporary pointer
            while (t.next != null) { // traverse till last node
                t = t.next;
            }
            t.next = nd; // attach new node at the end
        }
        System.out.println(val + " added to last");
    }

    // Add at first (beginning of linked list)
    void addFirst(int val) {
        Node nd = new Node(val); // create a new node
        nd.next = start;         // new node points to current start
        start = nd;              // update start to new node
        System.out.println(val + " added to first");
    }

    // Check if list is empty
    boolean isEmpty() {
        return (start == null);
    }

    // Print linked list
    void printList() {
        Node t = start; // temporary pointer
        System.out.print("start ---> ");
        while (t != null) {
            System.out.print(t.val + " ---> "); // print node value
            t = t.next; // move to next node
        }
        System.out.println("X"); // end of list
    }
}

// Node class (single element of linked list)
class Node {
    int val;   // data part
    Node next; // reference to next node

    Node(int v) {
        val = v;
        next = null; // next initially null
    }
}
