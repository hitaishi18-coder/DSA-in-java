///   first check size and then value 


public class _16_check_two_lists_equal_or_not {
    public static void main(String[] args) {
        MyLinkedList ll1 = new MyLinkedList();
        
        // First linked list : 10 -> 20 -> 30 -> 40
        ll1.add(10);
        ll1.add(20);
        ll1.add(30);
        ll1.add(40);
        
        MyLinkedList ll2 = new MyLinkedList();
        
        // Second linked list : 10 -> 20 -> 35 -> 40
        ll2.add(10);
        ll2.add(20);
        ll2.add(30);
        ll2.add(40);
        
        // check if both linked lists are equal
        System.out.println(checkEquals(ll1.start, ll2.start));
    }

    // function to check whether two linked lists are equal or not
    static boolean checkEquals(Node start1 , Node start2) {
        // find length of both lists
        int l1 = size(start1);
        int l2 = size(start2);

        // if lengths are not equal, lists can’t be equal
        if( l1 != l2) {
            return false;
        }
        else {
            // pointers for both lists
            Node t1 = start1;
            Node t2 = start2;

            boolean difference = false; // flag to track mismatch

            // traverse both lists simultaneously
            while (t1 != null) { 
                // if data doesn’t match, mark difference
                if(t1.val != t2.val) {
                    difference = true;
                    break; // stop checking further
                }
                else {
                    // move to next nodes
                    t1 = t1.next;
                    t2 = t2.next;
                }
            }

            // if mismatch found, return false otherwise true
            if(difference) {
                return false;
            }
            else {
                return true;
            }
        }
    }

    // Calculate size (number of nodes in linked list)
    static int size(Node start) {
        int count = 0;     // counter
        Node t = start;    // start from head
        while (t != null) { // traverse till end
            count++;       // increment count for each node
            t = t.next;    // move to next node
        }
        return count;      // return total nodes
    }
}

// Node class for Linked List
class Node {
    int val;
    Node next;
    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

// Linked List helper class
class MyLinkedList {
    Node start;

    // function to add node at end of linked list
    void add(int val) {
        Node nd = new Node(val);
        if(start == null) {  // first node
            start = nd;
        } else {             // attach at the end
            Node t = start;
            while(t.next != null) {
                t = t.next;
            }
            t.next = nd;
        }
    }
}





