public class _10_transpose {
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        System.out.println("Original");
        printMatrix(a);

        int b[] [] = transpose(a);

        System.out.println("after transpose ");
        printMatrix(b);
    }

    static int[][] transpose(int a [] [] )
    {
        int i , j ,  M = a.length , N = a[0].length;
        int b [] [] = new int [N] [M];
        for (i = 0; i < M; i++)
        {
            for ( j = 0; j < N; j++) 
            {
             b[j][i] = a[i][j];   
            }  
        }
        return b;
    } 

    static void printMatrix(int a[] [])
    {
        System.out.println("elements of matrix ");
        for (int i = 0; i <= a.length-1; i++) 
        {
             for (int j = 0; j <= a[0].length-1; j++) 
             {
               System.out.print(a[i][j]+ "\t");   
             }
             System.out.println();
        }
    }
}
