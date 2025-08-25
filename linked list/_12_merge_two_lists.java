public class _12_merge_two_lists {
    public static void main(String[] args) {
        MyLinkedList ll1 = new MyLinkedList();

        // create first linked list
        ll1.add(10);
        ll1.add(20);
        ll1.add(30);
        ll1.add(40);
        ll1.add(50);

        // print first list
        printList(ll1.start);

        MyLinkedList ll2 = new MyLinkedList();

        // create second linked list
        ll2.add(60);
        ll2.add(70);
        ll2.add(80);
        ll2.add(90);
        ll2.add(100);

        // print second list
        printList(ll2.start);

        // merge two lists into one
        Node start3 = merge(ll1.start, ll2.start);

        // print merged list
        printList(start3);
    }

    // merges list2 at the end of list1
    static Node merge(Node start1, Node start2) {
        // if first list is empty, return second list
        if (start1 == null) return start2;
        // if second list is empty, return first list
        if (start2 == null) return start1;

        // traverse to the last node of list1
        Node t = start1;
        while (t.next != null) { 
            t = t.next;
        }
        // attach list2 at the end of list1
        t.next = start2; 

        // return the head of merged list
        return start1;
    }

    // utility function to print linked list
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
    int val;    // value of node
    Node next;  // pointer to next node
    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

// LinkedList helper class
class MyLinkedList {
    Node start;

    // function to add new node at end
    void add(int val) {
        Node nd = new Node(val);
        if (start == null) {     // if list is empty
            start = nd;
        } else {                 // traverse and add at end
            Node t = start;
            while (t.next != null) {
                t = t.next;
            }
            t.next = nd;
        }
    }
}
