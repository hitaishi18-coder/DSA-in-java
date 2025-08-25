public class _11_get_element {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();

        // add nodes
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(49);
        ll.add(50);
        ll.add(100);
        
        // print the list
        ll.printLinkedList();

        // get element at index 2 (0-based indexing)
        System.out.println(ll.getElementAt(2));
    }
}

class MyLinkedList {
    Node start;

    // add element at the end of list
    void add(int val) {
        Node nd = new Node(val);
        if (start == null) {       // if first node
            start = nd;
        } else {
            Node t = start;
            while (t.next != null) { // move to last node
                t = t.next;
            }
            t.next = nd;            // attach new node
        }
    }

    // calculate size of linked list
    int size() {
        int count = 0;
        Node t = start;
        while (t != null) { // traverse entire list
            count++;
            t = t.next;
        }
        return count;
    }

    // get element at given index (0-based indexing)
    int getElementAt(int index) {
        int l = size(); 

        if(index < 0 || index >= l) {   // invalid index
            return -1; // returning -1 if not found
        } else {
            int i = 0; 
            Node t = start;  // start traversing from head

            while (t != null) { 
                if(i == index) { // found index
                    break;
                } else {
                    t = t.next; // move ahead
                    i++;
                }
            }
            return t.val; // return element at index
        }
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

// node structure
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null; 
    }
}
