import java.util.Arrays;

public class merge_and_get_3D_array 
{
    public static void main(String[] args) 
    {
        int a[] = {2,3,8,10,15,20};
        int b[] = {1,5,9,16,18,21,25,28};
        int c[] = mergeSorted(a,b);
        System.out.println(Arrays.toString(c));
    }   
    static int[] mergeSorted(int a[] , int b[])
    {
        int m = a.length;
        int n = b.length;
        int c[] = new int [m+n];
        int i,j,k;
        i=0;
        j=0;
        k=0;
        while(true)
        {
            if(a[i]<b[j])
            {
                c[k] = a[i];
                i++;
                k++;
                // 1st array ends 
                if(i==m)
                {
                    // copy remaining from 2nd array 
                    for(;j<=n-1;j++)
                    {
                        c[k] = b[j];
                        k++;
                    }
                    break;
                }
            }
            else 
            {
                c[k] = b[j];
                j++;
                k++;
                
                // 2nd array ends 
                if(j==n)
                {
                    // copy remAining from 1st array 
                    for(;i<=m-1;i++)
                    {
                        c[k] = a[i];
                        k++;
                    }
                    break;
                }

            }
        
        }
        return c;
    }
}
