import java.util.Arrays;

public class reverse 
{
    public static void main(String[] args) 
    {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int b[] = (reverseArray(a));
        System.out.println(Arrays.toString(b));  // for printing an array 

    }
    static int[] reverseArray(int a[])
    {
        int l = a.length;
        for(int i=0; i<=l/2-1;i++)
        {
            // swaping 

            int t = a[i];
            a[i]=a[l-1-i];    // bcoz a[i] = a[l-1-i]     .. that is a[9-i]
            a[l-1-i]=t; 
    }
    return a;
}
}



// tick 