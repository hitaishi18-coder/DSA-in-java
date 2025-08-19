public class _11_square_transpose {
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};

        System.out.println("Original Matrix:");
        printMatrix(a);

        System.out.println("After Transpose:");
        transposeMatrix(a); 
    }

    static void transposeMatrix(int a[][]) {
        int M = a.length, N = a[0].length;

        for (int i = 0; i < M; i++) {
            for (int j = i + 1; j < N; j++) {
                int t = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = t;
            }
        }

  
        printMatrix(a);
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
