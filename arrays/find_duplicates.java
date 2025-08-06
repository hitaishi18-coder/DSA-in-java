

import java.util.*;

public class find_duplicates
{
    public static void main(String[] args) 
    {
        int a[] = { 4,3,2,7,8,2,3,1 };
        
        System.out.println(findDuplicates(a));
    }
    
    static List<Integer> findDuplicates(int a[])
    {
        List<Integer> al = new ArrayList<>();
        
        HashSet<Integer> hs = new HashSet<>();
        
        for(int p : a)
        {
            if(hs.add(p)==false)
            {
                al.add(p);
            }
        }
        
        return al;
    }
}