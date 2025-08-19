import java.util.Arrays;

public class _18_sort_each_row {
    public static void main(String[] args) {
        int a[][] = {{9,8,7},{6,5,4},{3,2,1}};
        System.out.println("original");
        printMatrix(a);


        sortEachRow(a);


        System.out.println("after sorting");
        printMatrix(a);

    }

    static void sortEachRow(int a [] [])
    {
        int M = a.length;

        for(int i=0; i<M-1; i++)
        {
            Arrays.sort(a[i]);
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
