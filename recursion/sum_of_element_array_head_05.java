public class sum_of_element_array_head_05 {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        System.out.println(sumOfArray(a,a.length-1));
    }
    static int sumOfArray(int a[] , int i)
    {
        if( i ==0 )
        {
            return a[0];
        }
        else 
        {
            return a[i] + sumOfArray(a, i-1);
        }
    }

}
