public class _24_keep_only_boundary_2 {
    public static void main(String[] args) {
         int a[][] = {{1,2,3,4,5},{6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}};
         int b[][] = keepOnlyBoundary(a);
         printMatrix(b);
    }
    static int[][] keepOnlyBoundary(int a[][])
    {
        int i , j , M = a.length, N= a[0].length;
        int b[][] = new int [M][N];
        for(i=0;i<=M-1;i++)
        {
            for(j=0;j<=N-1;j++)
            {
                if(i==0 || i==M-1 || j==0 || j == N-1)
                {
                    b[i][j] = a[i][j];
                }
                else
                {
                    b[i][j] = 0;
                }
            }
        }
        return b ; 
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
