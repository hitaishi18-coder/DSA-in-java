public class _4_size {
    public static void main(String[] args) {
        
        MyLinkedList ll = new MyLinkedList();

        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(49);
        ll.add(50);
        ll.add(100);
        
        ll.printLinkedList();
        System.out.println("Size of linked list = " + ll.size());
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
    int size() {
        int count = 0;
        Node t = start;
        while (t != null) { 
            count++;
            t = t.next;
        }
        return count;
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
