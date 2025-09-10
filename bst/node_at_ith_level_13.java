public class node_at_ith_level_13 {
    public static void main(String[] args) {
    MyBinarySearchTree bst = new MyBinarySearchTree();
      
      bst.add(50);
      bst.add(40);
      bst.add(60);
      bst.add(30);
      bst.add(35);
      bst.add(10);
      bst.add(45);
      bst.add(70);
      bst.add(90);    
      
      printElements(bst.root, 2);

    }

    static void printElements(TNode t , int level)
    {
        inOrder(t , 0 , level);
    }
    static void inOrder(TNode t , int i , int level)
    {
        if(t==null)
        {
            // do nothing 
        }
        else if(i == level)
        {
            System.out.println(t.val + " ");
        }
        else
        {
            inOrder(t.left, i+1, level);
            inOrder(t.right, i+1, level);
        }
    }
}
