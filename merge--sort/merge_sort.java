
import java.util.*;

public class merge_sort
{
    public static void main(String[] args) 
    {
        int a[] = { 8,7,6,5,4,3,2,1 };
        
        System.out.println("--original --");
        System.out.println(Arrays.toString(a));
        
        divide(a, 0, a.length-1);
        
        System.out.println("-- After Merge Sort --");
        System.out.println(Arrays.toString(a));
    }
    
    static void divide(int a[], int L, int U)
    {
       if(L==U)
       {
        // base condition , return 
        // we have reached sorted array 
       }
       else 
       {
         int mid = (L+U)/2;

         divide(a, L, mid);

         divide(a, mid+1, U);

         splitAndMergeBack(a, L, U);
       }
    }
    
    static void splitAndMergeBack(int a[], int L, int U)
    {
        // Split
        
        int mid = (L+U)/2;
        
        int t1[] = new int[mid-L+1];
        int t2[] = new int[U-mid];
        
        for(int i=0; i<=t1.length-1; i++)
        {
            t1[i] = a[i+L];
        }
        
        for(int j=0; j<=t2.length-1; j++)
        {
            t2[j] = a[j+(mid+1)];
        }
        
        //System.out.println(Arrays.toString(t1));
        //System.out.println(Arrays.toString(t2));
        
        
        // Merge Back
        int m = t1.length;
        int n = t2.length;
        
        int i,j,k;
        
        i=0;
        j=0;
        
        // point where elements will be copied back
        k=L;
        
        while(true)
        {
            if(t1[i]<t2[j])
            {
                a[k] = t1[i];
                i++;
                k++;
                
                // 1st array ends
                if(i==m)
                {
                    // copy remaining from 2nd array
                    for(j=j  ; j<=n-1; j++)
                    { 
                        a[k] = t2[j];
                        k++;
                    }
                    
                    break;
                }
            }
            else
            {
                a[k] = t2[j];
                j++;
                k++;
                
                // 2nd array ends
                if(j==n)
                {
                    // copy remaining from 1st array
                    for(i=i ; i<=m-1; i++)
                    {
                        a[k] = t1[i];
                        k++;
                    }
                    
                    break;
                }
            }
        }
        
    }
}