public class size_05 {
    public static void main(String[] args) {
        MyBinarySearchTree bst = new MyBinarySearchTree();

        bst.add(70);
        bst.add(40);
        bst.add(90);
        bst.add(20);
        bst.add(50);

        System.out.println("Tree size (method1): " + bst.size());
        System.out.println("Tree size (method2): " + bst.size2(bst.root));
    }
}

// BST class
class MyBinarySearchTree {
    TNode root;

    // Add node
    void add(int val) {
        if (root == null) {
            root = new TNode(val);
        } else {
            TNode t = root;
            while (true) {
                if (val < t.val) {
                    if (t.left == null) {
                        t.left = new TNode(val);
                        break;
                    }
                    t = t.left;
                } else if (val > t.val) {
                    if (t.right == null) {
                        t.right = new TNode(val);
                        break;
                    }
                    t = t.right;
                } else {
                    // duplicate
                    break;
                }
            }
        }
    }

    // Method 1: Using array counter (call by reference)
    int size() {
        int count[] = {0};
        size(root, count);
        return count[0];
    }

    void size(TNode t, int count[]) {
        if (t == null) return;
        size(t.left, count);
        count[0]++;   // count this node
        size(t.right, count);
    }

    // Method 2: Pure recursion
    int size2(TNode t) {
        if (t == null) return 0;
        return 1 + size2(t.left) + size2(t.right);
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

