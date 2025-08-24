// run krne ki file .. 
public class _1_manual_linked_list
{
    public static void main(String[] args) 
    {
        Node start;
        Node nd1 = new Node(10);
        Node nd2 = new Node(20);
        Node nd3 = new Node(30);
        Node nd4 = new Node(40);
        
        start    = nd1;
        nd1.next = nd2;
        nd2.next = nd3;
        nd3.next = nd4;

        // print linked list
        Node t = start;
        System.out.print("start-->");
        while (t!=null) 
        {
            System.out.print(t.val+"-->");
           t = t.next;   
        }
        System.out.print("X");
    }
    
}
