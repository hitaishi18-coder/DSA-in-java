public class smallest_digit_head_09 {
    public static void main(String[] args) {
        System.out.println(find(465789));
    }
    static int find(int n)
    {
        if(n == 0 )
        {
            return 10;
        }
        else 
        {
            int r = n%10;
            int ans = find(n/10);
            // if(r < ans )
            //            return r ;
            // else 
            //            return ans ;    
            
            return Math.min(r, ans);
        }
    }
}
