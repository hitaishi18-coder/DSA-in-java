public class pre_in_post_order_04 {
    public static void main(String[] args) {
        MyBst bst = new MyBst();

        bst.add(70);
        bst.add(40);
        bst.add(90);
        bst.add(20);
        bst.add(50);
        bst.add(90); 

        System.out.println("\nInorder traversal:");
        bst.visitinOrder(bst.root);
        System.out.println();

        System.out.println("\nPreorder traversal:");
        bst.visitpreOrder(bst.root);
        System.out.println();

        System.out.println("\nPostorder traversal:");
        bst.visitpostOrder(bst.root);
        System.out.println();
    }
}

// Node class
class TNode {
    int val;
    TNode left, right;

    public TNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

// BST class
class MyBst {
    TNode root;

    void add(int val) {
        if (isEmpty()) { // add first
            TNode nd = new TNode(val);
            root = nd;
            System.out.println(val + " added as first Node");
        } else { // add more
            TNode t = root;

            while (true) {
                if (val < t.val) { // element is smaller
                    if (t.left == null) { // space available, attach to left
                        TNode nd = new TNode(val);
                        t.left = nd;
                        System.out.println(val + " added to left of " + t.val);
                        break;
                    } else { // simple go left
                        t = t.left;
                    }
                } else if (val > t.val) { // element is bigger
                    if (t.right == null) { // space available, attach to right
                        TNode nd = new TNode(val);
                        t.right = nd;
                        System.out.println(val + " added to right of " + t.val);
                        break;
                    } else { // simply go right
                        t = t.right;
                    }
                } else if (val == t.val) { // duplicate
                    System.out.println(val + " is duplicate, ignoring");
                    break;
                }
            }
        }
    }

    boolean isEmpty() {
        if (root == null) {
            return true;
        } else {
            return false;
        }
    }

    void visitpreOrder(TNode t) {
        if (t == null) {
            // do nothing
        } else {
            System.out.print(t.val + " ");
            visitpreOrder(t.left);
            visitpreOrder(t.right);
        }
    }

    void visitpostOrder(TNode t) {
        if (t == null) {
            // do nothing
        } else {
            visitpostOrder(t.left);
            visitpostOrder(t.right);
            System.out.print(t.val + " ");
        }
    }

    void visitinOrder(TNode t) {
        if (t == null) {
            // do nothing
        } else {
            visitinOrder(t.left);
            System.out.print(t.val + " ");
            visitinOrder(t.right);
        }
    }
}
