import java.util.Arrays;
public class _17_sort_diagonals {
    public static void main(String[] args) {
         int a[][] = {{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12},{13, 14, 15, 16}};
         System.out.println("original");
         printMatrix(a);


         sortDiagonals(a);


         System.out.println("after sort");

         printMatrix(a);
    }

    static void sortDiagonals(int a[][])
    {
        int N = a.length;
        int b[] = new int [N];


        // copy diagonals to 1D

        for(int i=0; i< N-1 ; i++){
            b[i] = a[i][i];
        }

        Arrays.sort(b);


        // copy 1D to diagonals

        for(int i=0 ; i<N-1; i++){
            a[i][i] = b[i];
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
