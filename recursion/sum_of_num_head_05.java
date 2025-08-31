public class sum_of_num_head_05 {
    public static void main(String[] args) {
        System.out.println(sumOfNum(10));
    }
    static int sumOfNum(int n )
    {
        if(n == 0 )
        {
            return 0;
        }
        else
        {
            return n + sumOfNum(n-1);
        }
    }
}
