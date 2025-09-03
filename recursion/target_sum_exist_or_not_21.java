public class target_sum_exist_or_not_21 {
    public static void main(String[] args) 
    {
        int a[] = { 1,2,3,7,8,10 };
        
        int target = 10;
        
        System.out.println( ways(a, target, 0, "", 0) );   
    }
    
    static boolean ways(int a[], int target, int i, String ans, int sum)
    {
        if(i==a.length)
        {
            if(target == sum )
            {
                //System.out.println(ans);
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {   
            boolean ans1 = ways(a, target, i+1, ans+a[i]+" ", sum+a[i]);
            
            boolean ans2 = ways(a, target, i+1, ans, sum);
            
            return ans1 || ans2;
        }
        
    }
}