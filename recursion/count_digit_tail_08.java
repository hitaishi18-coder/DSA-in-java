public class count_digit_tail_08 {
    public static void main(String[] args) {
        countDigit(9876096 ,0);
    }
    static void countDigit(int n , int count)
    {
        if(n == 0 )
        {
            System.out.println(count);
        }
        else 
        {
            // int r = n%10;
            countDigit(n/10, count+1);
        }
    }
}
