import java.util.Arrays;
import java.util.LinkedHashSet;

public class union 
{
    public static void main(String[] args) 
    {
        int a[] = {3,6,10,20};
        int b[] = {7,6,10,3,4};
        int c[] = unionn(a,b);
        System.out.println(Arrays.toString(c));
    }
    static int[] unionn(int a[] , int b[])
    {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        for(int i=0;i<=a.length-1;i++)
        {
            lhs.add(a[i]);
        }
        for(int i=0;i<=b.length-1;i++)
        {
            lhs.add(b[i]);
        }
        // System.out.println(lhs);
        int l= lhs.size();
        int c[] = new int[l];
        int i=0;
        for(int p: lhs)
        {
            c[i]=p;
            i++;
        }
        return c;
    }

}


// linked hashset = order maintain + duplicate remove 


// Linked hashset se p mey data aayega , set se aaya p mey gaya , fir c[i] mey gya and i++ hoga 
