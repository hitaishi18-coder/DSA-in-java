public class _11_get_element {
         public static void main(String[] args) {
        
        MyLinkedList ll = new MyLinkedList();

        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(49);
        ll.add(50);
        ll.add(100);
        
        ll.printLinkedList();

        System.out.println(ll.getElementAt(2));
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


    // get element at 


    int getElementAt(int index)
    {
        int l = size();

        if(index < 0 || index >= l)
        {
            return -1;
        }
        else
        {
            int i=0 ; 

            Node t = start ;

            while (t != null) { 
                if(i == index)
                {
                    break;
                }
                else
                {
                    t = t.next;
                    i++;
                }
            }
            return t.val;
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

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null; 
    }
}
