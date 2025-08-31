public class check_array_is_sorted_head_10 {
    public static void main(String[] args) {

        int a[] = { 1,2,3,4,5,6,7,8};
        System.out.println(isSorted(a, 0));
    }
    static boolean isSorted(int a[] , int i )
    {
        if(i == a.length-1)
        {
            return true ;
        }
        else 
        {
            boolean ans = isSorted(a, i+1);
            return (a[i]<a[i+1]) && ans ;
        }
    }
}
