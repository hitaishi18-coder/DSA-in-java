public class _25_spiral {
    public static void main(String[] args) {
        int N = 10;
        int a[][] = generateMatrix(N);
        printMatrix(a);

    }
    static int[][] generateMatrix(int N)
    {
        int a[][] = new int [N][N];
        int i , j , k, x1, x2, y1 , y2 ;

        x1 = 0 ;
        y1 = 0 ;
        y2 = N-1;
        x2 = N-1;


        i = 0;
        j = 0;
        k = 1;


        outer: while(true){
            // go right 


            for(j = y1; j <= y2; j++) {

                a[i][j] = k ;
                k++;


                if(k>N*N){
                    break outer;
                }
            }
            j--;
            x1 ++;


            // go down 
            for ( i = x1; i <= x2; i++) {
                a[i][j] = k; 
                k++;

                if(k>N*N){
                    break outer;
                }
            }

            i-- ;
            y2--;


            // go left 

            for ( j = y2; j >= y1; j--) {
                a[i][j] = k;
                k++;
                if(k>N*N){
                    break outer;
                }
            }
            j++;
            x2--;


            // go up 

            for ( i = x2; i >= x1; i--) {
                a[i][j] = k;
                k++;
                if(k>N*N){
                    break outer;
                }
            }

            i++;
            y1++;
        }
        return a;

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
