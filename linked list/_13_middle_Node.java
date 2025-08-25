public class _13_middle_Node {
    public static void main(String[] args) {

        MyLinkedList ll = new MyLinkedList();

        // adding elements to linked list
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(49);
        ll.add(50);
        ll.add(100);

        // print complete linked list
        ll.printLinkedList();

        // find middle node of the list
        Node middleNode = MyLinkedList.middNode(ll.start);

        // print middle node value
        System.out.println("Middle element is: " + middleNode.val);

        // print linked list starting from middle node
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

    // add a new element at the end of the linked list
    void add(int val) {
        Node nd = new Node(val);
        if (start == null) {
            // if list is empty, new node becomes start
            start = nd;
        } else {
            // otherwise, traverse to the end and add node
            Node t = start;
            while (t.next != null) {
                t = t.next;
            }
            t.next = nd;
        }
    }

    // calculate size of linked list
    static int size(Node start) {
        int count = 0;
        Node t = start;
        while (t != null) {
            count++;        // count each node
            t = t.next;
        }
        return count;
    }

    // get element (node) at a given index
    static Node getElementAt(Node start, int index) {
        int l = size(start); // get size of list
        if (index < 0 || index >= l) {
            // index out of bounds
            return null;
        } else {
            int i = 0;
            Node t = start;
            while (t != null) {
                if (i == index) break; // found required index
                t = t.next;
                i++;
            }
            return t; // return node at index
        }
    }

    // find the middle node of linked list
    public static Node middNode(Node start) {
        int l = size(start);           // get size of list
        int middle_position = l / 2;   // calculate middle index
        return getElementAt(start, middle_position); // return middle node
    }

    // print complete linked list from start
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
    int val;   // value of node
    Node next; // pointer to next node

    Node(int val) {
        this.val = val;
        this.next = null; // initially, next is null
    }
}
