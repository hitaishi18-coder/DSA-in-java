import java.util.Arrays;

public class _19_sort_each_column {
    public static void main(String[] args) {
            int a[][] = {{9,8,7},{6,5,4},{3,2,1}};
            System.out.println("original");
            printMatrix(a);

            sortEachColumn(a);

            System.out.println("after sorting");
            printMatrix(a);
    }

    static void sortEachColumn(int a[][]){
     int M = a.length;
    int N = a[0].length;
    int b [] = new int[M];
    {
        for(int j=0; j<=N-1 ; j++){// j = column index
            // Copy current column into temporary array
            for(int i=0; i<= M-1; i++)
            {
                b[i] = a[i][j];
            }

            Arrays.sort(b);

            {
                for(int i=0; i< M-1 ; i++){
                    a[i][j] = b[i];
                }
            }
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
