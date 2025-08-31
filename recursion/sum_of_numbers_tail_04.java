public class sum_of_numbers_tail_04 {
    public static void main(String[] args) {
        sumOfNumbers(10,0);
    }
    static void sumOfNumbers(int n , int ans)
    {
        if(n == 0)
        {
            System.out.println(ans);
        }
        else
        {
            ans = ans + n ;
            sumOfNumbers(n-1, ans);
        }
    }
}
