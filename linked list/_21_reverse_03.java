public class _21_reverse_03 {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();

        // Add elements
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);

        // Print original list
        printList(ll.start);

        // Reverse the list
        Node start2 = reverse(ll.start);

        // Print reversed list
        printList(start2);
    }

    // Reverse function (iterative)
    static Node reverse(Node start) {
        if (start == null || start.next == null) {
            return start;
        }

        Node t1 = null;
        Node t2 = start;
        Node t3 = start.next;

        while (true) {
            t2.next = t1; // reverse link
            t1 = t2;      // move t1
            t2 = t3;      // move t2

            if (t2 == null) {
                break;
            }
            t3 = t3.next; // move t3
        }

        return t1; // new head
    }

    // Print function
    static void printList(Node start) {
        Node t = start;
        System.out.print("start --> ");
        while (t != null) {
            System.out.print(t.val + " --> ");
            t = t.next;
        }
        System.out.println("X");
    }
}

// Node class
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

// LinkedList class
class MyLinkedList {
    Node start;

    // Add at end (simplified — no extra variable)
    public void add(int val) {
        if (start == null) {
            start = new Node(val);   // directly assign
            return;
        }
        Node t = start;
        while (t.next != null) {
            t = t.next;
        }
        t.next = new Node(val);  // directly create node here
    }
}
