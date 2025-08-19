
import java.util.Arrays;

public class _7_sum_of_each_column {
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        System.out.println(Arrays.toString(sumOfEachColumn(a)));
    }
    static int [] sumOfEachColumn(int a[][])
    {
        int sum, i , j , M = a.length, N = a[0].length;
        int b[] = new int[N];
        for( j=0 ; j < N; j++) // column loop 
        {
            sum = 0 ;
            for (i = 0; i < M ; i++)  // row loop 
            {
                sum = sum + a[i] [j];
            }
            b[j] = sum;
        }
        return  b ; 
    }
}
