

public class in_order_03 {
    public static void main(String[] args) {
        MyBst tree = new MyBst();

        tree.add(70);
        tree.add(40);
        tree.add(90);
        tree.add(20);
        tree.add(50);
        tree.add(90); // duplicate

        System.out.println("\nInorder traversal:");
        tree.visitInOrder(tree.root);
    }
}

//  Node class
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
                    if (t.right == null) { // Space Available, Attach to right
                        TNode nd = new TNode(val);
                        t.right = nd;
                        System.out.println(val + " added to right of " + t.val);
                        break;
                    } else { // Simply Go Right
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
        if(root == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    void visitInOrder(TNode t) {
        if(t == null)
        {

        }
        else
        {
            visitInOrder(t.left);
            System.out.println(t.val + " ");
            visitInOrder(t.right);
        }
    }
}
