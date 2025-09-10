public class smallest_digit_07 {
    public static void main(String[] args) {
        MyBst bst = new MyBst();

        bst.add(70);
        bst.add(40);
        bst.add(90);
        bst.add(20);
        bst.add(50);

        System.out.println("\nInorder Traversal:");
        bst.visitinOrder(bst.root);

        System.out.println("\n\nSearching...");
        System.out.println("Contains 50? " + bst.contains(50));
        System.out.println("Contains 25? " + bst.contains(25));

        System.out.println("\nSmallest value in BST: " + bst.smallestDigit());
    }
}

class MyBst {
    TNode root;

    void add(int val) {
        if (isEmpty()) {
            root = new TNode(val);
            System.out.println(val + " added as first Node");
        } else {
            TNode t = root;
            while (true) {
                if (val < t.val) {
                    if (t.left == null) {
                        t.left = new TNode(val);
                        System.out.println(val + " added to left of " + t.val);
                        break;
                    }
                    t = t.left;
                } else if (val > t.val) {
                    if (t.right == null) {
                        t.right = new TNode(val);
                        System.out.println(val + " added to right of " + t.val);
                        break;
                    }
                    t = t.right;
                } else {
                    System.out.println(val + " is duplicate, ignoring");
                    break;
                }
            }
        }
    }

    boolean isEmpty() {
        return root == null;
    }

    void visitinOrder(TNode t) {
        if (t != null) {
            visitinOrder(t.left);
            System.out.print(t.val + " ");
            visitinOrder(t.right);
        }
    }

    boolean contains(int val) {
        TNode t = root;
        while (t != null) {
            if (val < t.val) {
                t = t.left;
            } else if (val > t.val) {
                t = t.right;
            } else {
                return true;
            }
        }
        return false;
    }

    // Method to find the smallest value in BST
    int smallestDigit() {
        if (root == null) {
            System.out.println("BST is empty!");
            return -1; // or throw exception
        }
        TNode t = root;
        while (t.left != null) {
            t = t.left;
        }
        return t.val;
    }
}

class TNode {
    int val;
    TNode left, right;

    public TNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
