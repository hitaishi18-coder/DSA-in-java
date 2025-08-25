// run krne ki file (main file to execute linked list example)
public class _1_manual_linked_list
{
    public static void main(String[] args) 
    {
        // create 4 nodes manually
        Node nd1 = new Node(10);
        Node nd2 = new Node(20);
        Node nd3 = new Node(30);
        Node nd4 = new Node(40);

        // link nodes together to form a linked list
        Node start;       // head pointer (start of list)
        start    = nd1;   // start points to first node
        nd1.next = nd2;   // 10 --> 20
        nd2.next = nd3;   // 20 --> 30
        nd3.next = nd4;   // 30 --> 40
                         // nd4.next = null (by default)

        // printing linked list
        Node t = start;   // temporary pointer for traversal
        System.out.print("start-->");
        while (t != null)  // traverse till end
        {
            System.out.print(t.val + "-->");
            t = t.next;   // move to next node
        }
        System.out.print("X"); // marks end of list
    }
}
