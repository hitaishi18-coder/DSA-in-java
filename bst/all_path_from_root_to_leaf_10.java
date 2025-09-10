public class all_path_from_root_to_leaf_10 {
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
        
        System.out.println("All Paths from Root to Leaf ...");
        allPath(bst.root, "");

    }
    static void allPath(TNode t , String ans)
    {
        if( t == null)
        {
            // do nothing 
        }
        else if(t.left == null && t.right == null)
        {
            System.out.println(ans);
        }
        else 
        {
            ans = ans + t.val + " ";
            allPath(t.left, ans);
            allPath(t.right, ans);
        }
    }
}
