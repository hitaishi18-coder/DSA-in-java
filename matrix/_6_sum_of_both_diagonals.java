public class _6_sum_of_both_diagonals
{
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        System.out.println(sumOfDiagonals(a));
    }
    static int sumOfDiagonals(int a[] [])
    {
        int sum = 0 ;
        int N = a.length;
        for(int i=0; i<=N-1; i++)
        {
            for (int j = 0; j <= N-1; j++) 
            {
                if(i==j || i+j == N-1)
                sum = sum + a[i] [j];
            }
        }
        return sum;
    }
}