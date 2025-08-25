public class _8_delete_from_index {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        
        // adding nodes
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(49);
        ll.add(50);
        ll.add(100);

        // delete node at given indices
        ll.delete(3);    // deletes 49 (0-based indexing)
        ll.delete(5);    // invalid, because size after first delete is 5 (0 to 4 only)
        ll.delete(10);   // invalid, out of range

        // print final list
        ll.printLinkedList(); 
    }
}

class MyLinkedList {
    Node start; // head node

    // add new node at the end
    void add(int val) {
        Node nd = new Node(val);
        if (start == null) {  // if list empty
            start = nd;
        } else {
            Node t = start;
            while (t.next != null) { // traverse till last node
                t = t.next;
            }
            t.next = nd; // attach new node
        }
    }

    // delete node at specific index
    void delete(int index) {
        if (start == null) {
            // list empty, nothing to delete
            return;
        }
        else if (index < 0 || index >= size()) {
            // invalid index (negative or >= size)
            return;
        }
        else if (index == 0) {
            // special case: delete first node
            start = start.next;
        }
        else {
            Node t = start;
            int i = 0;

            // traverse till (index - 1)th node
            while (t != null && i < index - 1) {
                t = t.next;
                i++;
            }

            // if (index - 1)th node exists and has a next
            if (t != null && t.next != null) {
                // skip the node at "index"
                t.next = t.next.next;
            }
        }
    }

    // calculate size of linked list
    int size() {
        int count = 0;
        Node t = start;
        while (t != null) {
            count++;
            t = t.next;
        }
        return count;
    }

    // print linked list
    void printLinkedList() {
        Node t = start;
        System.out.println("start --->");

        while (t != null) {
            System.out.println(t.val + " --->");
            t = t.next;
        }
        System.out.println("X");
    }

    // Node structure
    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
}
