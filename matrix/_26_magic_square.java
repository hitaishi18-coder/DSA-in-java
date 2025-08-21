import java.util.Scanner;

public class _26_magic_square {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();

        if(N%2==0){
            System.out.println("N should be odd ");
        }

        else{
            int a[][] = magicSquare(N);
            printMatrix(a);
        }
    }
    static int[][] magicSquare(int N ){
        int i , j , k , org_i, org_j;

        int a[][] = new int[N][N];

        // start point 

        i=0;
        j = N/2;
        k=1;
        a[i][j] = k;
        k++;

        while (true) { 
            // rule 1 

            org_i = i;
            org_j = j ;

            i = i-1;
            j=j+1;

            // rule 2 

            if(i==-1) // out of row 
            {
                i = N-1 ;
            }

            if(j==N){ // out of column 
                j = 0;
            }

            // rule 3 

            if(a[i][j]==0)    //  space available , fill
            {
                a[i][j] = k ;
                k++;

                if(k> N*N)
                {
                    break;
                }
            }
            else {
                // backtrack 
                i = org_i;
                j = org_j;

                // 1 row down 
                i = i +1;

                a[i][j] = k;
                k++;

                if(k>N*N){
                    break;
                }
            }
        }
        return a ; 
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
