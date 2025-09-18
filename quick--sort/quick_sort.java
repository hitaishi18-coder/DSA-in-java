import java.util.Arrays;

public class quick_sort
{
    public static void main(String[] args) 
    {
        int a[] = {10,7,2,3,6,1,4,5,8,9,5};
        int L = 0;
        int U = a.length-1;
        System.out.println(Arrays.toString(a));
        System.out.println("position:" +  partition(a,L,U));
        System.out.println(Arrays.toString(a));
    }
    static int partition(int a[] , int L , int U)
    {
        int i,j , PIVOT , t  ;
        i = L-1;
        PIVOT = a[U];

        for (j = L; j < U-1; j++) 
        {
            // find smaller number and move backward 
            // smaller no will be moved to a[i]
            if(a[j] <= PIVOT)
            {
                i    = i+1;


                t    = a[j];
                a[j] = a[i];
                a[i] = t ;
            }
        }
        // place  pivot element at i+1 

        t      = a[i+1];
        a[i+1] = a[U];
        a[U]   = t ;

        // return correct position of PIVOT ..
        return i+1 ;
    }
}