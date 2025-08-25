public class _14_merge_two_sorted_lists {
    public static void main(String[] args) {
        MyLinkedList ll1 = new MyLinkedList();

        ll1.add(10);
        ll1.add(20);
        ll1.add(30);

        MyLinkedList ll2 = new MyLinkedList();

        ll2.add(15);
        ll2.add(25);
        ll2.add(35);
        ll2.add(45);

        // merge two sorted lists
        Node start3 = mergeTwoLists(ll1.start, ll2.start);

        // print final merged list
        printList(start3);
    }

    public static Node mergeTwoLists(Node start1 , Node start2)
    {
        // if both lists are empty
        if(start1 == null && start2 == null)
        {
            return null;
        } 
        // if only first list is non-empty
        else if(start1 != null && start2 == null)
        {
            return start1;
        }
        // if only second list is non-empty
        else if(start1 == null && start2 != null)
        {
            return start2;
        }
        else 
        {
            // final merged list head
            Node start3 = null;

            // pointers for traversing both lists
            Node t1 = start1;
            Node t2 = start2;
            Node t3 = start3;  // tail of merged list

            // iterate until one list ends
            while (true) { 
                if(t1.val < t2.val)
                {
                    // take node from first list
                    Node nd = new Node(t1.val);

                    if(start3 == null)
                    {
                        // if merged list is empty, make this first node
                        start3 = nd ;
                        t3 = nd ;
                    }
                    else {
                        // attach new node at end
                        t3.next = nd ;
                        t3 = nd ;
                    }

                    // move pointer in first list
                    t1 = t1.next;

                    // if first list is finished, stop loop
                    if(t1 == null)
                    {
                        break;
                    }
                }
                else 
                {
                    // take node from second list
                    Node nd = new Node(t2.val);

                    if(start3 == null)
                    {
                        // if merged list is empty, make this first node
                        start3 = nd ;
                        t3 = nd ;
                    }
                    else 
                    {
                        // attach new node at end
                        t3.next = nd ;
                        t3 = nd ;
                    }

                    // move pointer in second list
                    t2 = t2.next;

                    // if second list is finished, stop loop
                    if(t2 == null)
                    {
                        break;
                    }
                }
            }

            // now, one of the lists has ended
            // copy remaining nodes from whichever list is left

            if(t1 == null)
            {
                // first list finished, copy remaining from second list
                while (t2!=null) { 
                    Node nd = new Node(t2.val);

                    t3.next = nd ;
                    t3 = nd;

                    t2 = t2 .next;
                }
            }
            else 
            {
                // second list finished, copy remaining from first list
                while (t1 != null) { 
                    Node nd = new Node(t1.val);

                    t3.next = nd ;
                    t3 = nd ;

                    t1 = t1.next;
                }
            }
            return start3; // return merged list head
        }
    }

    // utility function to print list
    static void printList(Node start )
    {
        Node t = start;
        System.out.println("start--->");
        while (t != null) { 
            System.out.println(t.val+ "--->");
            t = t.next;
        }
        System.out.println("x");
    }
}
