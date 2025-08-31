

public class binary_search_tail_12 {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        binarySearch(a, 30, 0, a.length-1 , true);

    }
    static void binarySearch(int a[] , int num , int L , int U , boolean found )
    {
        int M = (L+U)/2;
        if(found == true)
        {
            System.out.println("found at " + M);
        }
        else if(L > U)
        {
            System.out.println("not found");
        }
        else 
        {
            if(num < a[M])
            {
                U = M-1;
            }
            else if(num > a[M])
            {
                L = M+1;
            }
            else 
            {
                found = true;
            }

            binarySearch(a, num, L, U, found);
        }
    }
}
