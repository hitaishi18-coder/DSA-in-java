import java.util.ArrayList;
import java.util.Arrays;

public class leetcode_26

// delete duplicates from sorted array 

{
    public static void main(String[] args) 
    {
        int a[] = { 1,2,2,3,3,3,4,4,4,5,5,7,8,9,10};
        int b[] = removeDuplicates(a);
        System.out.println(Arrays.toString(b));
    }
    static int[] removeDuplicates(int a[])
    {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<=a.length-1;i++)
        {
            al.add(a[i]);
        }
        for(int i=0;i<=al.size()-2;i++)
        {
            if(al.get(i) == al.get(i+1))
            {
            al.remove(i);
            i--;
            }
        }

        int b[] = new int[al.size()];
        for(int i=0;i<=al.size()-1;i++)
        {
            b[i]=al.get(i);
        }
        return b;
    }

}