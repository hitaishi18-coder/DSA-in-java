public class _22_cycle_detection {

    // Function to detect scycle
    public boolean hasCycle(Node start) {
        if (start == null || start.next == null) {
            // no cycle
            return false;
        }

        Node t1 = start;  // slow pointer
        Node t2 = start;  // fast pointer

        // Keep moving pointers until fast pointer reaches end
        while (t2 != null && t2.next != null) {
            t1 = t1.next;         // move 1 step
            t2 = t2.next.next;    // move 2 steps

            if (t1 == t2) {       // if they meet → cycle exists
                return true;
            }
        }
        return false; // reached null → no cycle
    }

    // Main method to test
    public static void main(String[] args) {
        _22_cycle_detection obj = new _22_cycle_detection();

        // Create a linked list
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // Case 1: No cycle
        System.out.println("Has cycle? " + obj.hasCycle(head)); // false

        // Case 2: Create a cycle (last node → second node)
        head.next.next.next.next = head.next;

        System.out.println("Has cycle? " + obj.hasCycle(head)); // true
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
