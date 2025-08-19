import java.util.Arrays;

public class _16_sort {
    public static void main(String[] args) {
        int a[][] = {{9, 10, 11, 12},{1, 2, 3, 4},{13, 14, 15, 16},{5, 6, 7, 8}};

        System.out.println("Original:");
        printMatrix(a);

        sort(a);

        System.out.println("After sorting:");
        printMatrix(a);
    }

    static void sort(int a[][]) {
        int M = a.length, N = a[0].length;
        int b[] = new int[M * N];

        // copy 2D to 1D
        int k = 0;
        for (int i = 0; i < M; i++) 
        {
            for (int j = 0; j < N; j++) 
            {
                b[k++] = a[i][j];
            }
        }

        // sort the 1D array
        Arrays.sort(b);

        // copy back 1D to 2D
        k = 0;
        for (int i = 0; i < M; i++) 
        {
            for (int j = 0; j < N; j++) 
            {
                a[i][j] = b[k++];
            }
        }
    }

    static void printMatrix(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
