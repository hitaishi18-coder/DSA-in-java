

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

    void add(int val) {
        if (start == null) {   // first node
            start = new Node(val);
        } else {
            Node t = start;
            while (t.next != null) {
                t = t.next;
            }
            t.next = new Node(val);
        }
    }
}

public class _10_reverse_02 {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList(); 

        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);

        Node start2 = reverse(ll.start);

        // printing
        Node t2 = start2;
        System.out.println("rev--->");
        while (t2 != null) {
            System.out.print(t2.val + "--->");
            t2 = t2.next;
        }
        System.out.println("null");
    }

    static Node reverse(Node start) {
        Node start2 = null;
        Node t = start;

        while (t != null) { 
            int num = t.val;

            Node nd = new Node(num);

            nd.next = start2;

            start2 = nd ;
            t = t.next;
        }
        return  start2;
    }

}