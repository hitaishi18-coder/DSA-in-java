import java.util.*;

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

public class _9_reverse_01 {
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
        Stack<Integer> st = new Stack<>();

        Node start2 = null;
        Node t = start;

        // push all values into stack
        while (t != null) {
            st.push(t.val);
            t = t.next;
        }

        // pop values and build new reversed list
        while (!st.isEmpty()) { // ✅ Fix: use st.isEmpty() not st.isEmpty
            int n = st.pop();   // ✅ Fix: st.pop() is a method, not a variable

            if (start2 == null) {
                start2 = new Node(n);
            } else {
                Node t2 = start2;
                while (t2.next != null) {
                    t2 = t2.next;
                }
                t2.next = new Node(n);
            }
        }
        return start2;
    }
}
