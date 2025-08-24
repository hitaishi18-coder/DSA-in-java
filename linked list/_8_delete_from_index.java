public class _8_delete_from_index {

    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(49);
        ll.add(50);
        ll.add(100);

        ll.delete(3);   
        ll.delete(5);
        ll.delete(10);

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

  
    void delete(int index) {
        if (start == null) {
            return;
        }
        else if (index < 0 || index >= size()) {
            // invalid index
            return;
        }
        else if (index == 0) {
            // delete first node
            start = start.next;
        }
        else {
            Node t = start;
            int i = 0;
       
            while (t != null && i < index - 1) {
                t = t.next;
                i++;
            }

            if (t != null && t.next != null) {
                t.next = t.next.next;
            }
        }
    }

    int size() {
        int count = 0;
        Node t = start;
        while (t != null) {
            count++;
            t = t.next;
        }
        return count;
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
