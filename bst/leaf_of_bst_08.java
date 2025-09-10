

import java.util.*;

public class leaf_of_bst_08
{
    public static void main(String[] args) 
    {
        MyBinarySearchTree bst = new MyBinarySearchTree();
        
        bst.add(50);
        bst.add(40);
        bst.add(60);
        
        bst.add(30);
        bst.add(35);
        bst.add(20);
        bst.add(10);
        bst.add(15);
        bst.add(70);
        
        bst.add(80);
        bst.add(90);
        bst.add(85);
        bst.add(75);
        
        System.out.println(leaf(bst.root));
    }    
    
    static List<Integer> leaf(TNode t)
    {
        List<Integer> al = new ArrayList<>();
        
        inOrder(t, al);
        
        return al;
    }
    
    static void inOrder(TNode t, List<Integer> al)
    {
        if(t==null)
        {
            // do nothing
        }
        else if(t.left==null && t.right==null)
        {
            al.add(t.val);
        }
        else
        {
            inOrder(t.left, al);
            inOrder(t.right, al);
        }
    }
    
}