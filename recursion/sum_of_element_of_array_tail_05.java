public class sum_of_element_of_array_tail_05 {
    public static void main(String[] args) {
        int a[] = { 10,20,30,40,50 };
        sumOfArray(a, a.length-1,0);
    }
    static void sumOfArray(int a[] , int i , int sum)
    {
        if(i == -1 )
        {
            System.out.println(sum);
        }
        else 
        {
            sum = sum + a[i];
            sumOfArray(a, i-1, sum);
        }
    }
}
