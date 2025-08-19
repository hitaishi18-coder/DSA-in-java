public class _20_extract_matrix {
    public static void main(String[] args) {
        int a[][] = {{1, 1,1,1,1,},{2,2,2,2,2},{3,3,3,3,3},{4,4,4,4,4},{5,5,5,5,5}};

        System.out.println("original ");
        printMatrix(a);


        int b[][] = subMatrix(a);


        System.out.println("after submatrix");
        printMatrix(b);

    }
  static int[][] subMatrix(int a[][]) {
        int M = a.length;
        int N = a[0].length;

    
        int b[][] = new int[M-2][N-2];

   
        for(int i = 1; i < M-1; i++) {
            for(int j = 1; j < N-1; j++) {
                b[i-1][j-1] = a[i][j];
            }
        }

        return b; 
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