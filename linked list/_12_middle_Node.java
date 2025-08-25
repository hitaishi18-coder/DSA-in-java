public class _12_middle_Node {
    public static void main(String[] args) {

        MyLinkedList ll = new MyLinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(49);
        ll.add(50);
        ll.add(100);

        ll.printLinkedList();

        // find middle node
        Node middleNode = MyLinkedList.middNode(ll.start);

        System.out.println("Middle element is: " + middleNode.val);

        // print from middle node
        System.out.print("List starting from middle: ");
        printList(middleNode);
    }

    // helper function to print from a given node
    static void printList(Node start) {
        Node t = start;
        while (t != null) {
            System.out.print(t.val + " ---> ");
            t = t.next;
        }
        System.out.println("X");
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

    // find size of linked list 
    static int size(Node start) {
        int count = 0;
        Node t = start;
        while (t != null) {
            count++;
            t = t.next;
        }
        return count;
    }

    // get element at index
    static Node getElementAt(Node start, int index) {
        int l = size(start);
        if (index < 0 || index >= l) {
            return null;
        } else {
            int i = 0;
            Node t = start;
            while (t != null) {
                if (i == index) break;
                t = t.next;
                i++;
            }
            return t;
        }
    }

    // middle node
    public static Node middNode(Node start) {
        int l = size(start);
        int middle_position = l / 2;
        return getElementAt(start, middle_position);
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
}

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}
