public class _9_sum_of_both_diagonals_method2 {
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        System.out.println("Sum of diagonals = " + sumOfDiagonals(a));
    }

    static int sumOfDiagonals(int a[][]) {
        int sum = 0, N = a.length;

        for (int i = 0; i < N; i++) {
            // Primary diagonal
            sum += a[i][i];
            // Secondary diagonal
            sum += a[i][N - 1 - i]; // right diagonals 
        }

        // If matrix size is odd, subtract the middle element (it was counted twice)
        if (N % 2 == 1) {
            sum -= a[N / 2][N / 2];
        }

        return sum;
    }
}
