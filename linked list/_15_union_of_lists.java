import java.util.LinkedHashSet;

public class _15_union_of_lists {
    public static void main(String[] args) {
        MyLinkedList ll1 = new MyLinkedList();
        // first linked list = 10 -> 20 -> 30
        ll1.add(10);
        ll1.add(20);
        ll1.add(30);
        
        MyLinkedList ll2 = new MyLinkedList();
        // second linked list = 20 -> 25 -> 30 -> 45
        ll2.add(20);
        ll2.add(25);
        ll2.add(30);
        ll2.add(45);
        
        // find union of two linked lists
        Node start3 = union(ll1.start, ll2.start);

        // print union list
        printList(start3);
    }

    // function to return union of two linked lists
    static Node union(Node start1 , Node start2) {
        // LinkedHashSet is used to store unique elements in insertion order
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();

        // traverse first list and add elements into set
        Node t1 = start1;
        while (t1 != null) { 
            hs.add(t1.val);
            t1 = t1.next;
        }

        // traverse second list and add elements into set
        Node t2 = start2;
        while (t2 != null) { 
            hs.add(t2.val);
            t2 = t2.next;
        }

        // print set just for checking unique values
        System.out.println(hs);

        // create a new linked list for union
        Node start3 = null;
        Node t3 = start3;

        // iterate through set and create linked list
        for(int p : hs) {
            Node nd = new Node(p);

            if(start3 == null) { // first node
                start3 = nd;
                t3 = nd;
            } else {             // attach at the end
                t3.next = nd;
                t3 = nd;
            }
        }
        return  start3;  // return head of union list
    }
       
    // utility function to print linked list
    static void printList(Node start) {
         Node t = start;
         
         System.out.print("start --> ");
         while(t != null) {
             System.out.print(t.val + " --> ");
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

// helper LinkedList class
class MyLinkedList {
    Node start;

    // function to add node at end
    void add(int val) {
        Node nd = new Node(val);
        if(start == null) {  // first node
            start = nd;
        } else {             // traverse till last and insert
            Node t = start;
            while(t.next != null) {
                t = t.next;
            }
            t.next = nd;
        }
    }
}
