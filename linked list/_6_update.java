public class _6_update {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList(); // create linked list object

        // add elements to linked list
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(49);
        ll.add(50);
        ll.add(100);

        // print original list
        ll.printLinkedList();

        // update all nodes with value = 50 → change to 80
        // update() returns number of nodes updated
        System.out.println("update " + ll.update(50, 80) + " nodes");

        // print updated list
        ll.printLinkedList();
    }
}

class MyLinkedList {
    Node start; // head node (first element of list)

    // add new node at end
    void add(int val) {
        Node nd = new Node(val);   // create new node
        if (start == null) {       // if list empty
            start = nd;            // first node becomes head
        } else {
            Node t = start;        // pointer for traversal
            while (t.next != null) {  // move till last node
                t = t.next;
            }
            t.next = nd; // attach new node at end
        }
    }

    // update logic → replace old_value with new_value
    // returns count of updated nodes
    int update(int old_value, int new_value) {
        int count = 0;   // to track how many updates done
        Node t = start;  // start from head
        while (t != null) {   // traverse till end
            if (t.val == old_value) { // check match
                t.val = new_value;    // update value
                count++;              // increase counter
            }
            t = t.next; // move to next node
        }
        return count; // return how many updates happened
    }

    // print linked list
    void printLinkedList() {
        Node t = start; // pointer at head
        System.out.println("start --->");
        while (t != null) { // traverse list
            System.out.println(t.val + " --->");
            t = t.next;
        }
        System.out.println("X"); // end of list
    }

    // inner Node class (each element of linked list)
    class Node {
        int val;   // stores data
        Node next; // reference to next node

        Node(int val) {
            this.val = val;
            this.next = null; // initially null
        }
    }
}
