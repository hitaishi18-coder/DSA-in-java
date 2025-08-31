public class count_digit_head_08 {
    public static void main(String[] args) {
        System.out.println(countDigit(456876543));
    }
    static int countDigit(int n)
    {
        if(n == 0 )
        {
            return 0 ; 
        }
        else 
        {
            return 1 + countDigit(n/10);
        }
    }
}
