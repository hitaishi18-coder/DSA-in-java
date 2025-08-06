import java.util.Arrays;

public class merge 
{
    public static void main(String[] args) 
    {
        int a[] = {10,7,2,6};
        int b[] = {2,5,2};
        int c[] = merges(a,b);
        System.out.println(Arrays.toString(c));
    }  
    static int[] merges(int a[] , int b[])
    {
        int m = a.length;
        int n = b.length;
        int c[] = new int [m+n];

        // copy from 1st array 
        for(int i=0;i<=a.length-1;i++)
        {
            c[i] = a[i];        
        }
        // copy from 2nd array 
        for(int i=0;i<=b.length-1;i++)
        {
            c[i+m] = b[i];
        }
        return c;
    }
}
