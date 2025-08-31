public class binary_search_head_12 {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        int result = binarySearch(a, 30, 0, a.length-1);

        if(result == -1)
            System.out.println("not found");
        else
            System.out.println("found at " + result);
    }

    static int binarySearch(int a[], int num, int L, int U)
    {
        if(L > U)   // base case
        {
            return -1;
        }

        int M = (L + U) / 2;

        if(num < a[M])
        {
            return binarySearch(a, num, L, M-1);  
        }
        else if(num > a[M])
        {
            return binarySearch(a, num, M+1, U); 
        }
        else
        {
            return M;  
        }
    }
}
