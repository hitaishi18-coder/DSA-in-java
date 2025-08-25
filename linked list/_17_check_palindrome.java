import com.sun.source.tree.TryTree;

public class _17_check_palindrome {
    public static void main(String[] args) {
         MyLinkedList ll = new MyLinkedList();
        
        // Creating linked list : 10 -> 20 -> 20 -> 10
        ll.add(10);
        ll.add(20);
        ll.add(20);
        ll.add(10);
        
        // Check if the linked list is palindrome
        System.out.println(isPalindrome(ll.start));
    }

    // Function to check whether given linked list is palindrome or not
    static boolean isPalindrome(Node start)
    {
        // Reverse the list and store in start2
        Node start2 = reverse(start);

        // Compare original and reversed list
        if(checkEquals(start, start2))
        {
            return true;   // If equal -> Palindrome
        }
        else 
        {
            return false ; // If not equal -> Not Palindrome
        }
    }

    // Function to create and return reverse of given linked list
    static Node reverse(Node start)
    {
       Node start2 = null;   // New list head
       Node t = start;       // Traversal pointer
       
       while(t!=null)
       {
           int num = t.val;
           
           // Create new node for each element
           // and insert at the beginning of start2
           Node nd = new Node(num);
           nd.next = start2;
           start2 = nd;
           
           t = t.next; // Move to next node in original list
       }
       
       return start2; // Return reversed list head
    }

    // Function to check if two linked lists are equal
    static boolean checkEquals(Node start1, Node start2)
    {
         // Find sizes of both lists
         int l1 = size(start1);
         int l2 = size(start2);
         
         // If sizes are different -> not equal
         if(l1!=l2)
         {
             return false;
         }
         else
         {
             // Now sizes are same, compare element by element
             Node t1 = start1;
             Node t2 = start2;
             
             boolean difference = false; // flag to track mismatch
             
             while(t1!=null)
             {
                 if(t1.val != t2.val) // If values differ
                 {
                     difference = true;
                     break; // No need to check further
                 }
                 else
                 {
                     // Move both pointers ahead
                     t1 = t1.next;
                     t2 = t2.next;
                 }
             }
             
             // If mismatch found return false, else true
             if(difference)
             {
                 return false;
             }
             else
             {
                 return true;
             }
         }
    }

    // Function to calculate size of linked list
    static int size(Node start)
    {
         int count = 0;    // counter
         Node t = start;   // traversal pointer
         
         while(t!=null)
         {
             count++;      // increment for each node
             t = t.next;   // move to next node
         }
        
         return count;     // return total count
    }

}
