import java.util.Arrays;

public class _21_sort_sub_matrix {
    public static void main(String[] args) {
         int a[][] = {{16, 3, 2, 13, 5, 10},{5, 10, 11, 8, 7, 1},{9, 6, 7, 12, 14, 4},{4, 15, 14, 1, 12, 6},
            {8, 9, 5, 3, 2, 11},{13, 7, 10, 6, 9, 15}};

            System.out.println("original");
            printMatrix(a);


              sortSubMatrix(a);

            System.out.println("after sort ");
            printMatrix(a);
    }


    static void sortSubMatrix(int a[][])
    {
        int M = a.length;
        int N = a[0].length;
        int b[] = new int [(M-2) * (N-2)];
        int k = 0;
        for(int i=1 ; i<=M-2 ; i++)
        {
            for(int j=1; j<=N-2;j++)
            {
                b[k] = a[i] [j];
                k++;
            }
        }


        Arrays.sort(b);

        k = 0; 


        for(int i = 1 ; i<= M-2 ; i++ )
        {
            for(int j =1 ; j<= N-2; j++)
            {
                a[i] [j] = b[k];
                k++;
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







