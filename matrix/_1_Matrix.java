import java.util.Scanner;

public class _1_Matrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[][] = new int[3][3];

        // input
        System.out.println("Enter elements of 3 x 3 Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = scan.nextInt();
            }
        }

        // printing
        printMatrix(a);

    }

    static void printMatrix(int a[][]) {
        System.out.println("Elements of Matrix:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
