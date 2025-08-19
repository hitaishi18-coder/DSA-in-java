import java.util.Arrays;

public class _14_horizontal_wave 
{
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12},{13, 14, 15, 16}};

        int ans[] = horizontalWave(a);
        System.out.println(Arrays.toString(ans));
    }

    static int[] horizontalWave(int a[][]) 
    {
        int M = a.length, N = a[0].length;
        int b[] = new int[M * N];
        int k = 0;

        for (int i = 0; i < M; i++) 
        {
            if (i % 2 == 0) 
            { 
                for (int j = 0; j < N; j++) 
                {
                    b[k++] = a[i][j];
                }
            } else 
            { 
                for (int j = N - 1; j >= 0; j--) 
                {
                    b[k++] = a[i][j];
                }
            }
        }
        return b;
    }
}
