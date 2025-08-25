import java.util.*;

// Node class
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

// Linked list class
class MyLinkedList {
    Node start;

    // add node at end
    void add(int val) {
        if (start == null) {   // first node
            start = new Node(val);
        } else {
            Node t = start;
            while (t.next != null) { // traverse till last
                t = t.next;
            }
            t.next = new Node(val);  // attach new node
        }
    }
}

public class _9_reverse_01 {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList(); 

        // adding nodes
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);

        // reverse the list (get new head)
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

    // reverse using stack
    static Node reverse(Node start) {
        Stack<Integer> st = new Stack<>();

        Node start2 = null;
        Node t = start;

        // step 1: push all values into stack
        while (t != null) {
            st.push(t.val);
            t = t.next;
        }

        // step 2: pop values and create new reversed linked list
        while (!st.isEmpty()) { 
            int n = st.pop(); // pop top value

            if (start2 == null) {
                // create first node of reversed list
                start2 = new Node(n);
            } else {
                // traverse till end and insert node
                Node t2 = start2;
                while (t2.next != null) {
                    t2 = t2.next;
                }
                t2.next = new Node(n);
            }
        }
        return start2; // return head of reversed list
    }
}
