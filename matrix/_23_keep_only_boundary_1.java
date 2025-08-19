public class _23_keep_only_boundary_1 {
    public static void main(String[] args) {
          int a[][] = {{1,2,3,4,5},{6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}};
          keepOnlyBoundary(a);
    }
    static void keepOnlyBoundary(int a[][])
    {
        int i , j , M = a.length, N = a[0].length;
        for(i=0; i<M; i++){
            for(j=0;j<N;j++)
            {
                if(i==0 || i== M-1 || j==0 || j == N-1)
                {
                    System.out.print(a[i][j] + "\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
