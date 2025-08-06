

public class missing_number
{
    public static void main(String[] args) 
    {
        int a[] = {1,2,4,5,6,7,8,9,10};
        System.out.println(missingNumber(a,10));
    }
    static int missingNumber(int a [], int N)       // actual numbers is N 
    {
        int expected_sum = N*(N+1)/2;
        int actual_sum = java.util.Arrays.stream(a).sum(); 
                int diff = expected_sum - actual_sum;
                return diff;
    }
}


// tick