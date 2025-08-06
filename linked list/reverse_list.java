
import java.util.Stack;

public class reverse_list 
{ public static void main(String[] args) 
    {
        my_linked_list ll = new my_linked_list();

        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);

        Node start2 = reverse(ll.start);


        // print reverse list 
        Node t2 = start2;
        System.out.println("rev-->");
        while(t2!=null)
        {
        System.out.println(t2.val+ "");
        t2=t2.next;
        }
        System.out.println();
    }




    static Node reverse(Node start)
    {
        Stack<Integer> st = new Stack<>();
        
        Node start2 = null;
        
        Node t = start;
        
        while(t!=null)
        {
            st.push( t.val );
            t = t.next;  
        }
        
        while(! st.isEmpty())
        {
            int num = st.pop();
            
            if(start2==null)      // add first element
            {
                Node nd = new Node(num);
                start2  = nd;  
            }
            else
            {
                Node t2 = start2;
                
                // Traverse and stop at last ListNode
                while(t2.next!=null)   
                {
                    t2 = t2.next;
                }
                
                Node nd = new Node(num);
                t2.next = nd;
            }
        }
        
        return start2;
    }}

