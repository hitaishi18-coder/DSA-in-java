public class factorial_tail_04 {
    public static void main(String[] args) {
        int n = 4 ;
        factorial(n , 4);
    }
    static void factorial(int n , int ans)
    {
        if(n == 0)
        {
            System.out.println(ans);
        }
        else
        {
            ans = ans * n ;
            factorial(n-1, ans);
        }
    }
}
