public class _8_sum_of_both_diagonals {
    public static void main(String[] args) {
         int a[][] = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
         System.out.println(sumOfDiagonals(a));
    }
    static int sumOfDiagonals(int a[] [])
    {
        int sum=0 ,i , j , N = a.length;
        for ( i = 0; i < N; i++) {
            for ( j = 0; j < N; j++) {
                if(i==j || i+j == N-1)
                {
                    sum = sum + a[i] [j];
                }
            }
        }
        return sum;
    }
}
