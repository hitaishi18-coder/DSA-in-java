public class _6_update {
    public static void main(String[] args) {
         MyLinkedList ll = new MyLinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(49);
        ll.add(50);
        ll.add(100);

        ll.printLinkedList();

        System.out.println("update" + " " + ll.update(50, 80) + " " + "nodes");

         ll.printLinkedList();
    }
}

class MyLinkedList
{
    Node start ;

    void add(int val)
    {
        Node nd = new Node(val);
        if (start == null)
        {
            start = nd;
        }
        else 
        {
            Node t = start ;
            while (t.next != null) { 
                t = t.next;
            }
            t.next = nd ;
        }
    }


    // update logic 
    int update(int old_value , int new_value)
    {
        int count = 0 ;
        Node t = start ;
        while (t != null) { 
            if(t.val == old_value)
            {
                t.val = new_value;
                count++;
            }
            t = t.next;
        }
        return count;
    }
    void printLinkedList()
    {
        Node t = start;
        System.out.println("start--->");

        while (t != null) { 
            System.out.println(t.val + "----->");

            t = t.next;
        }
        System.out.println("x");
    }

    class Node 
    {
        int val ;
        Node next ;

        Node(int val)
        {
            this.val = val;
            this.next = null;
        }
        
    }
}


