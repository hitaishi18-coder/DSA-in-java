public class power_tail_07 {
    public static void main(String[] args) {
        int x = 2 ;
        int y = 5;
        power(x , y , 1 );
    }

    static void power(int x , int y , int ans )
    {
        if( y == 0)
        {
            System.out.println(ans);
        }
        else 
        {
            ans = ans * x ;
            power(x, y-1, ans);
        }
    }
}
