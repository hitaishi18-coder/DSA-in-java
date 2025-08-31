public class smallest_digit_tail_09{
    public static void main(String[] args) {
        find(354678987, 10);
    }
    static void find(int n , int small)
    {
        if(n == 0)
        {
            System.out.println(small);
        }
        else 
        {
            int r = n % 10;
            if( r < small )
            {
                small = r ; 
            }
            find(n/10, small);
        }
    }
}