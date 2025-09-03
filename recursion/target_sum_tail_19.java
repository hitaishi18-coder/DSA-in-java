

public class target_sum_tail_19
{
    public static void main(String[] args) 
    {
        int a[] = { 1,2,3,7,8,10 };
        
        int target = 10;
        
        ways(a, target, 0, "", 0);
    }
    
    static void ways(int a[], int target, int i, String ans, int sum)
    {
        
        if(i==a.length)
        {
           if(sum==target)
           {
              System.out.println(ans+"--> "+sum);    
           }
           else
           {
               //System.out.println(ans+" --> X");
           }
           
        }
        else
        { 
           // Include
           ways(a, target, i+1, ans+a[i]+" ", sum +a[i]);
            
           // Dont Include 
           ways(a, target, i+1, ans, sum);
        }
        
    }
}