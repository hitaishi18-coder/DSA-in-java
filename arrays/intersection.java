import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class intersection 
{
    public static void main(String[] args) 
    {
         int a[] = {3,6,10,2,5};
         int b[] = {7,6,10,3,4};
         int c [] = intersectionn(a,b);
         System.out.println(Arrays.toString(c));
    }
    static int[] intersectionn(int a[] , int b[])
    {
        ArrayList<Integer> al = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();

        // copy elements  from array 1 
        for(int i=0;i<=a.length-1;i++)
        {
            hs.add(a[i]);
        }


        // try to copy from  2nd array to set hs (same)
        // element which are denied are coommon 
        // false bcoz jo elements A mey nhi honge woh alag honge 
        // add non exixting elements to array list

        for(int i=0;i<=b.length-1;i++)
        {
            if(hs.add(b[i])== false )
            {
                al.add(b[i]);
            }
        }
        int c[] = new int[al.size()];
        int i=0;
        for(int p:al)
        {
            c[i]=p;
            i++;
        }
        return c; 
    }
}
