public class _5_sum_of_each_row {
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        SumOfRows(a);
    }

    static void SumOfRows(int a[][]) {
        int sum, i, j, M = a.length, N = a[0].length;

        for (i = 0; i < M; i++) {
            sum = 0;
            for (j = 0; j < N; j++) {
                sum += a[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + " = " + sum);
        }
    }
}



