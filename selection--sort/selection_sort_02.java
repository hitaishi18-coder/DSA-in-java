import java.util.*;

public class selection_sort_02
{
    public static void main(String[] args)
    {   
       String a[] = { "ishita", "inaayat", "tisnoor", "avani", "harsh", "pranjal", "aditya", "ekam", "shubham", "yashika", "ankush", "atul", "hargun", "amrinder" }; 
        
       System.out.println("Before Sorting ...");
       System.out.println(Arrays.toString(a));
        
       selectionSort(a);
       
       System.out.println("After Sorting ...");
       System.out.println(Arrays.toString(a));
    }
    
    static void selectionSort(String a[])
    {
        int i, j, pos, N=a.length;
        String small, t;
        
        for(i=0 ; i<=N-2 ;i++)     // passes
        {
            small = a[i];
            pos   = i;
            
            // loop to find smallest number in remaing list
            for(j=i+1; j<=N-1; j++)
            {
                if ( a[j].compareTo(small) < 0 )    // < ASC, > DESC
                {
                    small = a[j];
                    pos   = j;
                }
            }
            
            // now swap a[i] with a[pos]
            t = a[i];
            a[i] = a[pos];
            a[pos] = t;
        }
    }
}
