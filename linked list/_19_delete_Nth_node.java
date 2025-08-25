public class _19_delete_Nth_node {
    public static void main(String[] args) {
         MyLinkedList ll = new MyLinkedList();
        
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        
        // Delete 3rd node from END
        Node start2 = removeNthFromEnd(ll.start, 3);
        
        // Print list after deletion
        printList(start2);
    }

    // Function jo last se Nth node delete karega
    public static Node removeNthFromEnd(Node start , int k)
    {
        // Pehle list ka size nikal lo
        int l = size(start);

        // Index nikalo from START -> formula = (size - k)
        int index = l - k;

        // Agar list empty hai to kuch mat karo
        if(start == null)
        {
            // do nothing 
        }
        // Agar index galat hai (negative ya size se bada) to kuch mat karo
        else if(index < 0 || index >= size(start))
        {
            // do nothing 
        }
        // Agar index == 0 hai -> matlab pehla element hi delete karna hai
        else if(index == 0)
        {
            start = start.next;
        }
        else 
        {
            // Traversal ke liye temp pointer
            Node t = start ;
            int i = 0 ;

            // Traverse karo jab tak (index - 1)th node tak na pahunch jao
            while (t != null) { 
                if(i == index - 1 )
                {
                    break;
                }
                t = t.next;
                i++;
            }

            // Ab (index-1)th node ke next ko (index+1)th node pe point kara do
            // Matlab indexth node ko skip kar diya -> delete
            t.next = t.next.next;
        }
        return start;
    }

    // List ka size nikalne ka helper function
    static int size(Node start)
    {
         int count = 0;
         Node t = start;
         
         while(t!=null)
         {
             count++;
             t = t.next;
         }
        
         return count;   
    } 
     
    // List print karne ka helper function
    static void printList(Node start)
    {
         Node t = start;
         System.out.print("start -->");
         while(t!=null)
         {
             System.out.print(t.val+" --> ");
             t = t.next;
         }
         System.out.println("X");
    }
}
