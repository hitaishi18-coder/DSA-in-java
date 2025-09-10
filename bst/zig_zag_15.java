import java.util.*;

public class zig_zag_15 {
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

        System.out.println(zigzagLevelOrder(bst.root));
    }

    static public List<List<Integer>> zigzagLevelOrder(TNode root) {
        List<List<Integer>> main_list = new ArrayList<>();
        int height = getHeight(root);

        for (int level = 0; level < height; level++) {
            List<Integer> levelList = new ArrayList<>();
            collectNodesAtLevel(root, 0, level, levelList);

            // Reverse list on odd levels
            if (level % 2 == 1) Collections.reverse(levelList);

            main_list.add(levelList);
        }

        return main_list;
    }

    static void collectNodesAtLevel(TNode t, int currentLevel, int targetLevel, List<Integer> levelList) {
        if (t == null) return;
        if (currentLevel == targetLevel) {
            levelList.add(t.val);
        } else {
            collectNodesAtLevel(t.left, currentLevel + 1, targetLevel, levelList);
            collectNodesAtLevel(t.right, currentLevel + 1, targetLevel, levelList);
        }
    }

    static int getHeight(TNode t) {
        if (t == null) return 0;
        int leftHeight = 1 + getHeight(t.left);
        int rightHeight = 1 + getHeight(t.right);
        return Math.max(leftHeight, rightHeight);
    }
}


