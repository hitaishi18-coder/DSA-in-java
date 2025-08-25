public class _11_merge_two_lists {
    public static void main(String[] args) {
        MyLinkedList ll1 = new MyLinkedList();

        ll1.add(10);
        ll1.add(20);
        ll1.add(30);
        ll1.add(40);
        ll1.add(50);

        printList(ll1.start);

        MyLinkedList ll2 = new MyLinkedList();

        ll2.add(60);
        ll2.add(70);
        ll2.add(80);
        ll2.add(90);
        ll2.add(100);

        printList(ll2.start);

        Node start3 = merge(ll1.start, ll2.start);

        printList(start3);
    }

    // merges list2 at the end of list1
    static Node merge(Node start1, Node start2) {
        if (start1 == null) return start2;
        if (start2 == null) return start1;

        Node t = start1;
        while (t.next != null) { 
            t = t.next;
        }
        t.next = start2; 

        return start1;
    }

    static void printList(Node start){
        Node t = start;
        System.out.print("start ---> ");
        while (t != null) {
            System.out.print(t.val + " ---> ");
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

// LinkedList helper class
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
}
