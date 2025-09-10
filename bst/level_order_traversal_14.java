public class level_order_traversal_14 {
    public static void main(String[] args) {
        TNode root = null;

        root = add(root, 50);
        root = add(root, 40);
        root = add(root, 60);
        root = add(root, 30);
        root = add(root, 35);
        root = add(root, 10);
        root = add(root, 45);
        root = add(root, 70);
        root = add(root, 90);

        levelOrderTraversal(root);
    }

    static TNode add(TNode t, int val) {
        if (t == null) return new TNode(val);
        if (val < t.val) t.left = add(t.left, val);
        else if (val > t.val) t.right = add(t.right, val);
        return t;
    }

    static void levelOrderTraversal(TNode t) {
        int height = getHeight(t);
        for (int k = 0; k <= height - 1; k++) {
            printElementAt(t, k);
            System.out.println("\n");
        }
    }

    static void printElementAt(TNode t, int level) {
        inOrder(t, 0, level);
    }

    static void inOrder(TNode t, int i, int level) {
        if (t == null) return;
        if (i == level) System.out.println(t.val + "");
        else {
            inOrder(t.left, i + 1, level);
            inOrder(t.right, i + 1, level);
        }
    }

    static int getHeight(TNode t) {
        if (t == null) return 0;
        int left_height = 1 + getHeight(t.left);
        int right_height = 1 + getHeight(t.right);
        return Math.max(left_height, right_height);
    }
}
