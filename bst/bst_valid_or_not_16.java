import java.util.*;

public class bst_valid_or_not_16 {
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

        System.out.println(isValidBST(bst.root));
    }

    public static boolean isValidBST(TNode t) {
        List<Integer> al = new ArrayList<>();
        visitInOrder(t, al);
        System.out.println(al);

        for (int i = 0; i < al.size() - 1; i++) {
            if (al.get(i) >= al.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    static void visitInOrder(TNode t, List<Integer> al) {
        if (t == null) return;
        visitInOrder(t.left, al);
        al.add(t.val);
        visitInOrder(t.right, al);
    }
}
