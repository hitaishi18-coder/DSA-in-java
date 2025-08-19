
import java.util.*;

public class _4_sum_of_each_row_return_in_array {
      public static void main(String[] args) {
        int a[][] = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        System.out.println(Arrays.toString(SumOfRows(a)));
        
    }

    static int []  SumOfRows(int a[][]) {
        int sum, i, j, M = a.length, N = a[0].length;
        int b[] = new int[M];

        for (i = 0; i < M; i++) {
            sum = 0;
            for (j = 0; j < N; j++) {
                sum += a[i][j];
            }
           b[i] = sum;
        }
        return b;
    }
}




