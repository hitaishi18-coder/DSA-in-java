public class _5_index_of {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList(); // create linked list

        // add elements to linked list
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(49);
        ll.add(50);
        ll.add(100);

        // print linked list
        ll.printLinkedList();

        // find index of given values
        System.out.println("Index of 50: " + ll.indexOf(50));   // present in list
        System.out.println("Index of 200: " + ll.indexOf(200)); // not present in list
    }
}

class MyLinkedList {
    Node start; // head pointer (first node of list)

    // add element at end of linked list
    void add(int val) {
        Node nd = new Node(val);   // create new node
        if (start == null) {       // if list empty
            start = nd;            // first node becomes head
        } else {
            Node t = start;        // temporary pointer
            while (t.next != null) {  // traverse till last node
                t = t.next;
            }
            t.next = nd; // attach new node at end
        }
    }

    // find index of a given element
    int indexOf(int val) {
        Node t = start; // start from head
        int i = 0;      // index counter
        while (t != null) {  // traverse till end
            if (t.val == val) { // if value matches
                return i;       // return current index
            }
            t = t.next; // move to next node
            i++;        // increase index
        }
        return -1; // element not found
    }

    // check if linked list is empty
    boolean isEmpty() {
        return (start == null);
    }

    // print linked list
    void printLinkedList() {
        Node t = start; // temporary pointer
        System.out.print("start ---> ");
        while (t != null) {  // traverse nodes
            System.out.print(t.val + " ---> ");
            t = t.next;
        }
        System.out.println("X"); // end of list
    }

    // inner Node class (represents each element of list)
    class Node {
        int val;   // data
        Node next; // link to next node
        Node(int val) {
            this.val = val;
            this.next = null; // initially null
        }
    }
}
