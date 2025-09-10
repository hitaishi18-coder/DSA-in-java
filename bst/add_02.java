public class add_02 {
    

      public static void main(String[] args) {
        MyBst bst = new MyBst();

        bst.add(70);
        bst.add(40);
        bst.add(90);
        bst.add(20);
        bst.add(50);
        bst.add(90); // duplicate

        System.out.println("\nInorder traversal:");
        bst.visitInOrder(bst.root);
    }
    // BST class
    static class MyBst {
        TNode root;

        // Add method
        void add(int val) {
            if (isEmpty()) {   // add first
                TNode nd = new TNode(val);
                root = nd;
                System.out.println(val + " added as first Node");
            } else {           // add more
                TNode t = root;

                while (true) {
                    if (val < t.val) {  // smaller → go left
                        if (t.left == null) {
                            t.left = new TNode(val);
                            System.out.println(val + " added to left of " + t.val);
                            break;
                        } else {
                            t = t.left;
                        }
                    } else if (val > t.val) { // bigger → go right
                        if (t.right == null) {
                            t.right = new TNode(val);
                            System.out.println(val + " added to right of " + t.val);
                            break;
                        } else {
                            t = t.right;
                        }
                    } else {  // duplicate
                        System.out.println(val + " is duplicate, ignoring");
                        break;
                    }
                }
            }
        }

        // Empty check
        boolean isEmpty() {
            return root == null;
        }

        // Inorder traversal
        void visitInOrder(TNode t) {
            if (t != null) {
                visitInOrder(t.left);
                System.out.print(t.val + " ");
                visitInOrder(t.right);
            }
        }
    }

    // Node class
    static class TNode {
        int val;
        TNode left, right;

        public TNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
  
}
