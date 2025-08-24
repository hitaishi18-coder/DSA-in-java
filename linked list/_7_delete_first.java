public class _7_delete_first {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(49);
        ll.add(50);
        ll.add(100);

        ll.deleteFirst();   

        ll.printLinkedList();  
    }
}

class MyLinkedList {
    Node start;

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
    }

    // delete first node
    void deleteFirst() {
        if (start == null) {
            System.out.println("List is empty, nothing to delete");
        } else {
            start = start.next;
        }
    }

    void printLinkedList() {
        Node t = start;
        System.out.println("start--->");

        while (t != null) {
            System.out.println(t.val + "----->");
            t = t.next;
        }
        System.out.println("x");
    }

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
}
