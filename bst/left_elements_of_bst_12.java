import java.util.ArrayList;
import java.util.List;

public class left_elements_of_bst_12 
{
    public static void main(String[] args) 
    {
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

        System.out.println(leftSide(root));
    }

    static TNode add(TNode root, int val)
    {
        if(root == null) return new TNode(val);

        if(val < root.val)
            root.left = add(root.left, val);
        else if(val > root.val)
            root.right = add(root.right, val);
        // else duplicate, do nothing
        return root;
    }
    
    static List<Integer> leftSide(TNode root)
    {
        ArrayList<Integer> al = new ArrayList<>();
        if(root != null) visit(root.left, al);
        return al;
    }
    
    static void visit(TNode t, ArrayList<Integer> al)
    {
        if(t == null) return;

        visit(t.left, al);
        al.add(t.val);
        visit(t.right, al);
    }
}

