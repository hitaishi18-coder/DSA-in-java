public class _3_Sum_of_all_elements {
    public static void main(String[] args) {
        int a[][] = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        SumOfAllElements(a);   
    }

    static void SumOfAllElements(int a[][]) {
        int sum = 0;
        int M = a.length, N = a[0].length;

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                sum = sum + a[i][j];   
            }
        }

        System.out.println("Sum of all elements = " + sum); 
    }
}
