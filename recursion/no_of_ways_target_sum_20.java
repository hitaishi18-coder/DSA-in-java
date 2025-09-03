

public class no_of_ways_target_sum_20
{
    public static void main(String[] args) 
    {
        int a[] = { 1,2,3,7,8,10 };
        
        int target = 10;
        
        System.out.println( ways(a, target, 0, "", 0) );   
    }
    
    static int ways(int a[], int target, int i, String ans, int sum)
    {
        
        if(i==a.length)
        {
           if(sum==target)
           {
              return 1;   
           }
           else
           {
               return 0;
           }
        }
        else
        { 
           // Include
           int ans1 = ways(a, target, i+1, ans+a[i]+" ", sum +a[i]);
            
           // Dont Include 
           int ans2 = ways(a, target, i+1, ans, sum);
           
           return ans1 + ans2;
        }
        
    }
}