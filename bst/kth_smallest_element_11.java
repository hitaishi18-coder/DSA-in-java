import java.util.ArrayList;

public class kth_smallest_element_11 {
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
      
        System.out.println(kthSmallest(bst.root, 3));
    }

    public static int kthSmallest(TNode root , int k) {
        ArrayList<Integer> al = new ArrayList<>();

        visit(root, al);

        System.out.println(al); //  to see sorted elements

        return al.get(k-1);
    }
    
    static void visit(TNode t , ArrayList<Integer> al) {
        if(t == null) {
            return;
        }
        visit(t.left, al);   // left subtree
        al.add(t.val);       // add current node
        visit(t.right, al);  // right subtree
    }
}
