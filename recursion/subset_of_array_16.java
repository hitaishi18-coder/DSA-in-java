import java.util.*;

public class subset_of_array_16
{
   public static void main(String[] args) 
    {
        int a[] = { 10,20,30 };
        
        String ans = "";
        
        subsets(a, 0, ans);
    }
    
    static void subsets(int a[], int i, String ans)
    {
        if(i==a.length)
        {
            System.out.print(ans+" --> ");
            
            int arr[] = convertToArray(ans);
            
            System.out.println(Arrays.toString(arr));
        }
        else
        {
            int num = a[i];
            
            // Include
           
            subsets(a, i+1, ans+num+" ");
            
            // Dont Include
            subsets(a, i+1, ans);
        }
    }    
    
    static int[] convertToArray(String s)
    {
        s = s.trim();
        
        StringTokenizer st = new StringTokenizer(s);
        
        int n = st.countTokens();
        
        if(n==0)
        {
            int arr[] = new int[0];
            return arr;
        }
        else
        {
            int arr[] = new int[n];
            
            for(int i=0; i<=arr.length-1; i++)
            {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            
            return arr;
        }
        
    }
}