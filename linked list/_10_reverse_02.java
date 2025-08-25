class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class MyLinkedList {
    Node start;

    // add node at the end of the list
    void add(int val) {
        if (start == null) {   // first node
            start = new Node(val);
        } else {
            Node t = start;
            while (t.next != null) { // traverse till last
                t = t.next;
            }
            t.next = new Node(val); // attach new node
        }
    }
}

public class _10_reverse_02 {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList(); 

        // adding nodes
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);

        // reverse the linked list (get new head)
        Node start2 = reverse(ll.start);

        // print reversed list
        Node t2 = start2;
        System.out.println("rev--->");
        while (t2 != null) {
            System.out.print(t2.val + "--->");
            t2 = t2.next;
        }
        System.out.println("null");
    }

    // reverse by creating a new list in reverse order
    static Node reverse(Node start) {
        Node start2 = null; // new head (reversed list)
        Node t = start;     // traverse original list

        while (t != null) { 
            int num = t.val;       // take value of current node
            Node nd = new Node(num); // create new node with same value

            // insert new node at the beginning of start2
            nd.next = start2; 
            start2 = nd;

            // move forward in original list
            t = t.next;
        }
        return start2; // return head of reversed list
    }
}
