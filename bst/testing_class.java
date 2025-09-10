public class testing_class {
    public static void main(String[] args) {
        create_tree_01 bst = new create_tree_01();

        bst.createTree();

        bst.visitInOrder(bst.root);

    }
}
