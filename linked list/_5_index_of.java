public class _5_index_of {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(49);
        ll.add(50);
        ll.add(100);

        ll.printLinkedList();

        System.out.println("Index of 50: " + ll.indexOf(50));
        System.out.println("Index of 200: " + ll.indexOf(200));
    }
}

class MyLinkedList {
    Node start;

    // add elements 
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

    // find index of element
    int indexOf(int val) {
        Node t = start;
        int i = 0;
        while (t != null) {
            if (t.val == val) {
                return i;   // return index immediately
            }
            t = t.next;
            i++;
        }
        return -1; // not found
    }

    // check if empty
    boolean isEmpty() {
        return (start == null);
    }

    // print linked list
    void printLinkedList() {
        Node t = start;
        System.out.print("start ---> ");
        while (t != null) {
            System.out.print(t.val + " ---> ");
            t = t.next;
        }
        System.out.println("X");
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
}
