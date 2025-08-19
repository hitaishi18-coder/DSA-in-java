import java.util.ArrayList;
import java.util.List;

public class _22_boundary_elements {
    public static void main(String[] args) {
        int a[][] = {{1,2,3,4,5},{6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}};
        System.out.println(boundaryElements(a));
    }

    static List <Integer> boundaryElements(int a[][])
    {
        int i , j , M = a.length, N = a[0].length;

        ArrayList <Integer> al = new ArrayList<>();


        // go right
        for(j=0 ; j<=N-1; j++)
        {
            al.add(a[0][j]);
        }

        // go down 
        for(i=1; i< M-1; i++)
        {
            al.add(a[i][N-1]);
        }

        // go left 

        for(j = N-1 ; j>=0; j--)
        {
            al.add(a[M-1][j]);
        }

        // go up 

        for(i=M-2; i>=1 ; i--)
        {
            al.add(a[i][0]);
        }
        return al;
    }
}
