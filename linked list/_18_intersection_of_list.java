import java.util.LinkedHashSet;

public class _18_intersection_of_list {
    public static void main(String[] args) {
    
        MyLinkedList ll1 = new MyLinkedList();
        ll1.add(10);
        ll1.add(20);
        ll1.add(30);
        ll1.add(40);
        
        MyLinkedList ll2 = new MyLinkedList();
        ll2.add(20);
        ll2.add(25);
        ll2.add(30);
        ll2.add(45);
        
        // Dono lists ka intersection nikalna hai
        Node start3 = intersection(ll1.start, ll2.start);

        // Intersection list print karna
        printList(start3);
    }

    // Dono linked lists ka intersection find karne ka function
    static Node intersection(Node start1 , Node start2)
    {
        // LinkedHashSet use kar rahe hain -> order preserve hota hai
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        Node t1 = start1;

        // Pehli list ke saare elements set me daal do
        while (t1 != null) { 
            hs.add(t1.val);
            t1 = t1.next;
        }

        Node start3 = null;  // ye hogi intersection list ka head
        Node t3 = null;      // ye hamesha last node pe rahega

        Node t2 = start2;
        while (t2 != null) { 
            // Agar dusri list ka element set me already present hai -> common element mila
            if(hs.contains(t2.val)) {
                Node nd = new Node(t2.val);

                // Agar intersection list abhi empty hai -> pehla element bana do
                if(start3 == null) {
                    start3 = nd;
                    t3 = nd;
                }
                else {
                    // Agar pehle se list bani hai to last me jod do
                    t3.next = nd;
                    t3 = nd;
                }
            }
            t2 = t2.next;  // dusri list me aage badho
        }

        return start3; // intersection list ka head return kar do
    }

    // Linked list print karne ka function
    static void printList(Node start)
    {
         Node t = start;
         System.out.print("start --> ");
         while(t!=null)
         {
             System.out.print(t.val+" --> ");
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

// Linked List banane ka helper class
class MyLinkedList {
    Node start;

    void add(int val) {
        Node nd = new Node(val);
        if(start == null) {   // Agar pehla node hai
            start = nd;
        } else {
            // warna last tak jao aur new node jod do
            Node t = start;
            while(t.next != null) {
                t = t.next;
            }
            t.next = nd;
        }
    }
}
