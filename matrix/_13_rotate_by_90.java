public class _13_rotate_by_90 {
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        rotate(a);
        printMatrix(a);  // show rotated matrix
    }

    static void rotate(int a[][]) {
        int b[][] = transpose(a);
        int c[][] = mirror(b);
        int i , j , M = a.length , N = a[0].length;   
        for (i = 0; i < M; i++) {                     
            for (j = 0; j < N; j++) {                 
                a[i][j] = c[i][j];
            }
        }
    }

    static int[][] transpose(int a [] [] ) {
        int i , j ,  M = a.length , N = a[0].length;
        int b [] [] = new int [N] [M];
        for (i = 0; i < M; i++) {
            for ( j = 0; j < N; j++) {
                b[j][i] = a[i][j];   
            }  
        }
        return b;
    } 

    static int [][] mirror(int a[][]) {
        int M = a.length , N = a[0].length;
        int b[][] = new int  [M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                b[i][N-1-j] = a[i][j];
            }
        }
        return b;
    }

    static void printMatrix(int a[] []) {
        System.out.println("Elements of rotated matrix:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]+ "\t");   
            }
            System.out.println();
        }
    }
}
