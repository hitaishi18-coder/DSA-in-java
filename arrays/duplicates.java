import java.util.HashSet;

public class duplicates 
{
    public static void main(String[] args) 
    {
        int a[] = {1,2,3,4,4,5,6,7,7,8,8,8,9};
        System.out.println(containsDuplicates(a));
    }
    public static boolean containsDuplicates(int a[])
    {
        int l1 = a.length;
        HashSet<Integer> hs = new HashSet<>();
        for(int p:a)
        {
            hs.add(p);
        }
        int l2 = hs.size();
        if (l1!=l2)
        {
            return true;
        }
        else 
        {
            return false ;
        }
    }
}


// output true means it contains duplicates 
