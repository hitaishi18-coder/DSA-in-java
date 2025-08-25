public class _7_delete_first {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList(); // create linked list

        // add elements
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(49);
        ll.add(50);
        ll.add(100);

        ll.deleteFirst();   // delete the first node (head)

        ll.printLinkedList();  // print list after deletion
    }
}

class MyLinkedList {
    Node start; // head of the linked list

    // add node at the end
    void add(int val) {
        Node nd = new Node(val);   // create new node
        if (start == null) {       // if list is empty
            start = nd;            // first node becomes head
        } else {
            Node t = start;        // pointer for traversal
            while (t.next != null) {  // move till last node
                t = t.next;
            }
            t.next = nd; // attach new node at end
        }
    }

    // delete first node of linked list
    void deleteFirst() {
        if (start == null) {   // if list is empty
            System.out.println("List is empty, nothing to delete");
        } else {
            start = start.next;   // move head to 2nd node
            // first node is automatically garbage collected
        }
    }

    // print linked list
    void printLinkedList() {
        Node t = start;  // start from head
        System.out.println("start --->");
        while (t != null) {  // traverse till end
            System.out.println(t.val + " --->");
            t = t.next;
        }
        System.out.println("X"); // end of list
    }

    // node structure
    class Node {
        int val;   // data
        Node next; // pointer to next node

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
}
