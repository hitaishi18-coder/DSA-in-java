public class _12_mirror_image {
    public static void main(String[] args) {
        int a[] [] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        System.out.println("original");
        printMatrix(a);

        int b[][] = mirror(a);
        System.out.println("mirror");
        printMatrix(b);
    }
    static int[][] mirror(int a[][])
    {
        int i , j , M = a.length , N = a[0].length;
        int b[][] = new int [M][N];
        for ( i = 0; i < M; i++) {
            for ( j = 0; j < N; j++) {
                b[i][N-1-j] = a[i][j];
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
