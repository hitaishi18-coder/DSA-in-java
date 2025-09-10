public class height_of_bst_09 {
    public static void main(String[] args) {
        MyBinarySearchTree bst = new MyBinarySearchTree();
        
        bst.add(50);
        bst.add(40);
        bst.add(60);
        
        bst.add(30);
        bst.add(35);
        bst.add(20);
        bst.add(10);
        bst.add(15);
        bst.add(70);
        
        bst.add(80);
        bst.add(90);
        bst.add(85);
        bst.add(75);
        
        System.out.println("Height of BST : "+getHeight(bst.root));

    }

    static int getHeight(TNode t)
    {
        if( t == null)
        {
            return  0 ;
        }
        else
        {
            int left_height  = 1 + getHeight(t.left);
            int right_height = 1 + getHeight(t.right);

            return Math.max(left_height, right_height);
        }
    }
}
