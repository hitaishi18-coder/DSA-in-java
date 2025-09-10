public class create_tree_01 {
    TNode root ;

    void createTree()
    {
        TNode t1 = new TNode(50);

        TNode t2 = new TNode(40);

        TNode t3 = new TNode(60);

        root = t1 ;
        
        t1.left = t2 ;
        t1.right = t3 ;
    }

    void visitInOrder(TNode t)
    {
        if(t == null)
        {

        }
        else 
        {
            visitInOrder(t.left);
            System.out.println(t.val+ "");
            visitInOrder(t.right);
        }
    }
}
