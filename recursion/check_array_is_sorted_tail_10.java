public class check_array_is_sorted_tail_10 {
    public static void main(String[] args) {
        int a[] = {2,34,6,8,00,56};
         isSorted(a, 0 , true );

    }

    static void isSorted(int a[] , int i , boolean  ans )
    {
        if(i == a.length-1)
        {
            System.out.println(ans);
        }
        else 
        {
            ans = ans && (a[i] < a[i+1]);
            isSorted(a, i+1, ans);
        }
    }
 
}
