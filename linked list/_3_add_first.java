public class _3_add_first {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();

        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);

        ll.addFirst(100);
        
        ll.printList();
    }
}   

class MyLinkedList {
    Node start;

    // Add at end
    void add(int val) {
        Node nd = new Node(val);

        if (start == null) {
            start = nd;
        } else {
            Node t = start;
            while (t.next != null) {
                t = t.next;
            }
            t.next = nd;
        }
        System.out.println(val + " added to last");
    }

    // Add at first
    void addFirst(int val) {
        Node nd = new Node(val);
        nd.next = start;
        start = nd;
        System.out.println(val + " added to first");
    }

    // Check empty
    boolean isEmpty() {
        return (start == null);
    }

    // Print list
    void printList() {
        Node t = start;
        System.out.print("start ---> ");
        while (t != null) {
            System.out.print(t.val + " ---> ");
            t = t.next;
        }
        System.out.println("X");
    }
}

class Node {
    int val;
    Node next;

    Node(int v) {
        val = v;
        next = null;
    }
}
